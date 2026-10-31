package g3801_3900.s3808_find_emotionally_consistent_users

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
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
            "CREATE TABLE reactions (" +
                " user_id INTEGER," +
                " content_id INTEGER," +
                " reaction VARCHAR(32)" +
                ");" +
                "INSERT INTO reactions (user_id, content_id, reaction) VALUES" +
                "(1, 1, 'like')," +
                "(1, 2, 'like')," +
                "(1, 3, 'like')," +
                "(1, 4, 'like')," +
                "(1, 5, 'like')," +
                "(2, 1, 'like')," +
                "(2, 2, 'like')," +
                "(2, 3, 'like')," +
                "(2, 4, 'like')," +
                "(2, 5, 'like')," +
                "(3, 1, 'like')," +
                "(3, 2, 'like')," +
                "(3, 3, 'like')," +
                "(3, 4, 'like')," +
                "(4, 1, 'like')," +
                "(4, 2, 'like')," +
                "(4, 3, 'love')," +
                "(4, 4, 'love')," +
                "(4, 5, 'sad');"
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
                                    "s3808_find_emotionally_consistent_users/" +
                                    "script.sql"
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
                                    resultSet.getString(3)
                                ),
                        )
                    }

                    val expectedRows = mutableListOf<String>("1|like|1", "2|like|1")
                    assertThat<MutableList<String>>(
                        actualRows,
                        equalTo<MutableList<String>>(expectedRows),
                    )
                }
            }
        }
    }
}
