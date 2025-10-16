package g3401_3500.s3497_analyze_subscription_conversion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.ResultSet
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        (
            "    CREATE TABLE UserActivity (" +
                "    user_id INT," +
                "    activity_date date," +
                "    activity_type VARCHAR(100)," +
                "    activity_duration INT" +
                ");" +
                "INSERT INTO UserActivity (user_id, activity_date, activity_type, activity_duration)" +
                "VALUES" +
                "    (1, '2023-01-01', 'free_trial', 45)," +
                "    (1, '2023-01-02', 'free_trial', 30)," +
                "    (1, '2023-01-05', 'free_trial', 60)," +
                "    (1, '2023-01-10', 'paid', 75)," +
                "    (1, '2023-01-12', 'paid', 90)," +
                "    (1, '2023-01-15', 'paid', 65)," +
                "    (2, '2023-02-01', 'free_trial', 55)," +
                "    (2, '2023-02-03', 'free_trial', 25)," +
                "    (2, '2023-02-07', 'free_trial', 50)," +
                "    (2, '2023-02-10', 'cancelled', 0)," +
                "    (3, '2023-03-05', 'free_trial', 70)," +
                "    (3, '2023-03-06', 'free_trial', 60)," +
                "    (3, '2023-03-08', 'free_trial', 80)," +
                "    (3, '2023-03-12', 'paid', 50)," +
                "    (3, '2023-03-15', 'paid', 55)," +
                "    (3, '2023-03-20', 'paid', 85)," +
                "    (4, '2023-04-01', 'free_trial', 40)," +
                "    (4, '2023-04-03', 'free_trial', 35)," +
                "    (4, '2023-04-05', 'paid', 45)," +
                "    (4, '2023-04-07', 'cancelled', 0);"
            ),
    ],
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.connection.use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            (
                                "src/main/kotlin/g3401_3500/" +
                                    "s3497_analyze_subscription_conversion/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    checkRow(resultSet, arrayOf<String>("1", "45.0", "76.67"))
                    checkRow(resultSet, arrayOf<String>("3", "70.0", "63.33"))
                    checkRow(resultSet, arrayOf<String>("4", "37.5", "45.0"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }

    @Throws(SQLException::class)
    private fun checkRow(resultSet: ResultSet, values: Array<String>) {
        assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
        assertThat<String>(resultSet.getNString(1), equalTo<String>(values[0]))
        assertThat<String>(resultSet.getNString(2), equalTo<String>(values[1]))
        assertThat<String>(resultSet.getNString(3), equalTo<String>(values[2]))
    }
}
