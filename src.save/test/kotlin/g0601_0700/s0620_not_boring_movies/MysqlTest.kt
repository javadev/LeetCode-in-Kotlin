package g0601_0700.s0620_not_boring_movies

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
        "CREATE TABLE cinema(id INTEGER PRIMARY KEY, movie VARCHAR(512)" +
            ", description VARCHAR(512), rating FLOAT); " +
            "INSERT INTO cinema(id, movie, description, rating)" +
            " VALUES (1, 'War', 'great 3D', 8.9); " +
            "INSERT INTO cinema(id, movie, description, rating)" +
            " VALUES (2, 'Science', 'fiction', 8.5); " +
            "INSERT INTO cinema(id, movie, description, rating)" +
            " VALUES (3, 'irish', 'boring', 6.2); " +
            "INSERT INTO cinema(id, movie, description, rating)" +
            " VALUES (4, 'Ice song', 'Fantacy', 8.6);" +
            "INSERT INTO cinema(id, movie, description, rating)" +
            " VALUES (5, 'House card', 'Interesting', 9.1);"
    ]
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
                            "src/main/kotlin/g0601_0700/" +
                                "s0620_not_boring_movies/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(5))
                    assertThat(resultSet.getNString(2), equalTo("House card"))
                    assertThat(resultSet.getNString(3), equalTo("Interesting"))
                    assertThat(resultSet.getNString(4), equalTo("9.1"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getNString(2), equalTo("War"))
                    assertThat(resultSet.getNString(3), equalTo("great 3D"))
                    assertThat(resultSet.getNString(4), equalTo("8.9"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
