package g1801_1900.s1890_the_latest_login_in_2020

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
        "CREATE TABLE Logins(user_id INTEGER, time_stamp DATETIME); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (6, '2020-06-30 15:06:07'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (6, '2021-04-21 14:06:06'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (6, '2019-03-07 00:18:15'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (8, '2020-02-01 05:10:53'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (8, '2020-12-30 00:46:50'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (2, '2020-01-16 02:49:50'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (2, '2019-08-25 07:59:08'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (14, '2019-07-14 09:00:00'); " +
            "INSERT INTO Logins(user_id, time_stamp)" +
            " VALUES (14, '2021-01-06 11:59:59'); "
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
                            "src/main/kotlin/g1801_1900/s1890_the_latest_" +
                                "login_in_2020/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getNString(2), equalTo("2020-01-16 02:49:50"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(6))
                    assertThat(resultSet.getNString(2), equalTo("2020-06-30 15:06:07"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(8))
                    assertThat(resultSet.getNString(2), equalTo("2020-12-30 00:46:50"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
