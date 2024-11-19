package g1101_1200.s1141_user_activity_for_the_past_30_days_i

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
        "CREATE TABLE activity(user_id INTEGER, session_id INTEGER" +
            ", activity_date DATE, activity_type VARCHAR(512)); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (1, 1, ' 2019-07-20', 'open_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (1, 1, ' 2019-07-20', 'scroll_down'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (1, 1, ' 2019-07-20', 'end_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (2, 4, ' 2019-07-20', 'open_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (2, 4, ' 2019-07-21', 'send_message'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (2, 4, ' 2019-07-21', 'end_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (3, 2, ' 2019-07-21', 'open_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (3, 2, ' 2019-07-21', 'send_message'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (3, 2, ' 2019-07-21', 'end_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (4, 3, ' 2019-06-25', 'open_session'); " +
            "INSERT INTO activity(user_id, session_id, activity_date, activity_type)" +
            " VALUES (4, 3, ' 2019-06-25', 'end_session'); ",
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
                            "src/main/kotlin/g1101_1200/s1141_user_activity_" +
                                "for_the_past_30_days_i/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-07-20"))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-07-21"))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
