package g3801_3900.s3832_find_users_with_persistent_behavior_patterns

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
            "CREATE TABLE activity (" +
                " user_id INTEGER," +
                " action_date DATE," +
                " action VARCHAR(32)," +
                " PRIMARY KEY (user_id, action_date, action)" +
                ");" +
                "INSERT INTO activity (user_id, action_date, action) VALUES" +
                "(1, '2024-01-01', 'login')," +
                "(1, '2024-01-02', 'login')," +
                "(1, '2024-01-03', 'login')," +
                "(1, '2024-01-04', 'login')," +
                "(1, '2024-01-05', 'login')," +
                "(1, '2024-01-06', 'logout')," +
                "(2, '2024-01-01', 'click')," +
                "(2, '2024-01-02', 'click')," +
                "(2, '2024-01-03', 'click')," +
                "(2, '2024-01-04', 'click')," +
                "(3, '2024-01-01', 'view')," +
                "(3, '2024-01-02', 'view')," +
                "(3, '2024-01-03', 'view')," +
                "(3, '2024-01-04', 'view')," +
                "(3, '2024-01-05', 'view')," +
                "(3, '2024-01-06', 'view')," +
                "(3, '2024-01-07', 'view');"
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
                                "src/main/kotlin/g3801_3900/" +
                                    "s3832_find_users_with_persistent_" +
                                    "behavior_patterns/script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    val actualRows: MutableList<String> = ArrayList<String>()
                    while (resultSet.next()) {
                        actualRows.add(
                            (
                                resultSet.getString(1) +
                                    "|" +
                                    resultSet.getString(2) +
                                    "|" +
                                    resultSet.getString(3) +
                                    "|" +
                                    resultSet.getString(4) +
                                    "|" +
                                    resultSet.getString(5)
                                ),
                        )
                    }

                    val expectedRows = mutableListOf<String>(
                        "3|view|7|2024-01-01|2024-01-07",
                        "1|login|5|2024-01-01|2024-01-05",
                    )
                    assertThat<MutableList<String>>(
                        actualRows,
                        equalTo<MutableList<String>>(expectedRows),
                    )
                }
            }
        }
    }
}
