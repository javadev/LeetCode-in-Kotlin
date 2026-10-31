package g3701_3800.s3793_find_users_with_high_token_usage

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
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
            "CREATE TABLE prompts (" +
                " user_id INTEGER," +
                " prompt VARCHAR(512)," +
                " tokens INTEGER," +
                " PRIMARY KEY (user_id, prompt)" +
                ");" +
                "INSERT INTO prompts (user_id, prompt, tokens) VALUES" +
                "(1, 'Write a blog outline', 120)," +
                "(1, 'Generate SQL query', 80)," +
                "(1, 'Summarize an article', 200)," +
                "(2, 'Create resume bullet', 60)," +
                "(2, 'Improve LinkedIn bio', 70)," +
                "(3, 'Explain neural networks', 300)," +
                "(3, 'Generate interview Q&A', 250)," +
                "(3, 'Write cover letter', 180)," +
                "(3, 'Optimize Python code', 220);"
            ),
    ],
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.getConnection().use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            (
                                "src/main/kotlin/g3701_3800/" +
                                    "s3793_find_users_with_high_token_usage/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    val actualRows: MutableList<String?> = ArrayList<String?>()
                    while (resultSet.next()) {
                        actualRows.add(
                            (
                                resultSet.getString(1) +
                                    "|" +
                                    resultSet.getString(2) +
                                    "|" +
                                    resultSet.getString(3)
                                ),
                        )
                    }

                    val expectedRows = mutableListOf<String?>("3|4|237.5", "1|3|133.33")
                    MatcherAssert.assertThat<MutableList<String?>?>(
                        actualRows,
                        CoreMatchers.equalTo<MutableList<String?>?>(expectedRows),
                    )
                }
            }
        }
    }
}
