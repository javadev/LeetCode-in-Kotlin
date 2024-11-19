package g1101_1200.s1148_article_views_i

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
        "CREATE TABLE views(article_id INTEGER, author_id INTEGER" +
            ", viewer_id INTEGER, view_date DATE); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (1, 3, 5, '2019-08-01'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (1, 3, 6, '2019-08-02'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (2, 7, 7, '2019-08-01'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (2, 7, 6, '2019-08-02'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (4, 7, 1, '2019-07-22'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (3, 4, 4, '2019-07-21'); " +
            "INSERT INTO views(article_id, author_id, viewer_id, view_date)" +
            " VALUES (3, 4, 4, '2019-07-21'); ",
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
                            "src/main/kotlin/g1101_1200/s1148" +
                                "_article_views_i/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(4))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(7))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
