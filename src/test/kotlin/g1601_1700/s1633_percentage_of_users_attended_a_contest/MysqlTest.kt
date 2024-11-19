package g1601_1700.s1633_percentage_of_users_attended_a_contest

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
        "CREATE TABLE Users(user_id INTEGER, user_name VARCHAR); " +
            "INSERT INTO Users(user_id, user_name) VALUES (6, 'Alice'); " +
            "INSERT INTO Users(user_id, user_name) VALUES (2, 'Bob'); " +
            "INSERT INTO Users(user_id, user_name) VALUES (7, 'Alex'); " +
            "CREATE TABLE Register(contest_id INTEGER, user_id INTEGER); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (215, 6); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (209, 2); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (208, 2); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (210, 6); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (208, 6); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (209, 7); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (209, 6); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (215, 7); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (208, 7); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (210, 2); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (207, 2); " +
            "INSERT INTO Register (contest_id, user_id) VALUES (210, 7); ",
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
                            "src/main/kotlin/g1601_1700/s1633_percentage_of_users_attended_a_contest/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(208))
                    assertThat(resultSet.getDouble(2), equalTo(100.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(209))
                    assertThat(resultSet.getDouble(2), equalTo(100.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(210))
                    assertThat(resultSet.getDouble(2), equalTo(100.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(207))
                    assertThat(resultSet.getDouble(2), equalTo(0.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(215))
                    assertThat(resultSet.getDouble(2), equalTo(0.0))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
