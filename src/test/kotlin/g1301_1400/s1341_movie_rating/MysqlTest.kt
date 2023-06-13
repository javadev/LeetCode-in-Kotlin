package g1301_1400.s1341_movie_rating

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
        "CREATE TABLE Movies(movie_id INTEGER, title VARCHAR); " +
            "INSERT INTO Movies(movie_id, title)" +
            " VALUES (1, 'Avengers'); " +
            "INSERT INTO Movies(movie_id, title)" +
            " VALUES (2, 'Frozen 2'); " +
            "INSERT INTO Movies(movie_id, title)" +
            " VALUES (3, 'Joker'); " +
        "CREATE TABLE Users(user_id INTEGER, name VARCHAR); " +
            "INSERT INTO Users(user_id, name)" +
            " VALUES (1, 'Daniel'); " +
            "INSERT INTO Users(user_id, name)" +
            " VALUES (2, 'Monica'); " +
            "INSERT INTO Users(user_id, name)" +
            " VALUES (3, 'Maria'); " +
            "INSERT INTO Users(user_id, name)" +
            " VALUES (4, 'James'); " +
        "CREATE TABLE MovieRating(movie_id INTEGER, user_id INTEGER, rating INTEGER, created_at DATE); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (1, 1, 3, '2020-01-12'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (1, 2, 4, '2020-02-11'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (1, 3, 2, '2020-02-12'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (1, 4, 1, '2020-01-01'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (2, 1, 5, '2020-02-17'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (2, 2, 2, '2020-02-01'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (2, 3, 2, '2020-03-01'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (3, 1, 3, '2020-02-22'); " +
            "INSERT INTO MovieRating(movie_id, user_id, rating, created_at)" +
            " VALUES (3, 2, 4, '2020-02-25'); "
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
                            "src/main/kotlin/g1301_1400/s1341_movie_rating" +
                                    "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Daniel"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Frozen 2"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
