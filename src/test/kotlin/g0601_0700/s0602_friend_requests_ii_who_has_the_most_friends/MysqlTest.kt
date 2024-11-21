package g0601_0700.s0602_friend_requests_ii_who_has_the_most_friends

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
        "CREATE TABLE RequestAccepted(requester_id INTEGER, accepter_id INTEGER, accept_date DATETIME); " +
            "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)" +
            " VALUES (1, 2, '2016-06-03'); " +
            "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)" +
            " VALUES (1, 3, '2016-06-08'); " +
            "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)" +
            " VALUES (2, 3, '2016-06-08'); " +
            "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)" +
            " VALUES (3, 4, '2016-06-09'); ",
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
                            "src/main/kotlin/g0601_0700/" +
                                "s0602_friend_requests_ii_who_has_the_most_friends/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
