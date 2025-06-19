package g3501_3600.s3586_find_covid_recovery_patients

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        (
            "CREATE TABLE patients (patient_id INTEGER, patient_name VARCHAR(255), age INTEGER); " +
                "INSERT INTO patients (patient_id, patient_name, age) VALUES" +
                "(1, 'Alice Smith', 28)," +
                "(2, 'Bob Johnson', 35)," +
                "(3, 'Carol Davis', 42)," +
                "(4, 'David Wilson', 31)," +
                "(5, 'Emma Brown', 29);" +
                "CREATE TABLE covid_tests (test_id INTEGER, patient_id INTEGER" +
                ", test_date DATE, result VARCHAR(255)); " +
                "INSERT INTO covid_tests (test_id, patient_id, test_date, result) VALUES" +
                "(1, 1, '2023-01-15', 'Positive')," +
                "(2, 1, '2023-01-25', 'Negative')," +
                "(3, 2, '2023-02-01', 'Positive')," +
                "(4, 2, '2023-02-05', 'Inconclusive')," +
                "(5, 2, '2023-02-12', 'Negative')," +
                "(6, 3, '2023-01-20', 'Negative')," +
                "(7, 3, '2023-02-10', 'Positive')," +
                "(8, 3, '2023-02-20', 'Negative')," +
                "(9, 4, '2023-01-10', 'Positive')," +
                "(10, 4, '2023-01-18', 'Positive')," +
                "(11, 5, '2023-02-15', 'Negative')," +
                "(12, 5, '2023-02-20', 'Negative');"
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
                                "src/main/kotlin/g3501_3600/" +
                                    "s3586_find_covid_recovery_patients/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Alice Smith"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("28"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("10"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("3"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Carol Davis"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("42"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("10"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("2"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Bob Johnson"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("35"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("11"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
