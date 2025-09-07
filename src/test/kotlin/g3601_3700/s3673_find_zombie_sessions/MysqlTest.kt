package g3601_3700.s3673_find_zombie_sessions

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
            "CREATE TABLE app_events (" +
                "    event_id INT PRIMARY KEY," +
                "    user_id INT NOT NULL," +
                "    event_timestamp TIMESTAMP NOT NULL," +
                "    event_type VARCHAR(50) NOT NULL," +
                "    session_id VARCHAR(50) NOT NULL," +
                "    event_value INT" +
                ");" +
                "INSERT INTO app_events (event_id, user_id, event_timestamp, " +
                "event_type, session_id, event_value) VALUES" +
                "(1, 201, '2024-03-01 10:00:00', 'app_open',  'S001', NULL)," +
                "(2, 201, '2024-03-01 10:05:00', 'scroll',    'S001', 500)," +
                "(3, 201, '2024-03-01 10:10:00', 'scroll',    'S001', 750)," +
                "(4, 201, '2024-03-01 10:15:00', 'scroll',    'S001', 600)," +
                "(5, 201, '2024-03-01 10:20:00', 'scroll',    'S001', 800)," +
                "(6, 201, '2024-03-01 10:25:00', 'scroll',    'S001', 550)," +
                "(7, 201, '2024-03-01 10:30:00', 'scroll',    'S001', 900)," +
                "(8, 201, '2024-03-01 10:35:00', 'app_close', 'S001', NULL)," +
                "(9, 202, '2024-03-01 11:00:00', 'app_open',  'S002', NULL)," +
                "(10, 202, '2024-03-01 11:02:00', 'click',    'S002', NULL)," +
                "(11, 202, '2024-03-01 11:05:00', 'scroll',   'S002', 400)," +
                "(12, 202, '2024-03-01 11:08:00', 'click',    'S002', NULL)," +
                "(13, 202, '2024-03-01 11:10:00', 'scroll',   'S002', 350)," +
                "(14, 202, '2024-03-01 11:15:00', 'purchase', 'S002', 50)," +
                "(15, 202, '2024-03-01 11:20:00', 'app_close','S002', NULL)," +
                "(16, 203, '2024-03-01 12:00:00', 'app_open', 'S003', NULL)," +
                "(17, 203, '2024-03-01 12:10:00', 'scroll',   'S003', 1000)," +
                "(18, 203, '2024-03-01 12:20:00', 'scroll',   'S003', 1200)," +
                "(19, 203, '2024-03-01 12:25:00', 'click',    'S003', NULL)," +
                "(20, 203, '2024-03-01 12:30:00', 'scroll',   'S003', 800)," +
                "(21, 203, '2024-03-01 12:40:00', 'scroll',   'S003', 900)," +
                "(22, 203, '2024-03-01 12:50:00', 'scroll',   'S003', 1100)," +
                "(23, 203, '2024-03-01 13:00:00', 'app_close','S003', NULL)," +
                "(24, 204, '2024-03-01 14:00:00', 'app_open', 'S004', NULL)," +
                "(25, 204, '2024-03-01 14:05:00', 'scroll',   'S004', 600)," +
                "(26, 204, '2024-03-01 14:08:00', 'scroll',   'S004', 700)," +
                "(27, 204, '2024-03-01 14:10:00', 'click',    'S004', NULL)," +
                "(28, 204, '2024-03-01 14:12:00', 'app_close','S004', NULL);"
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
                                "src/main/kotlin/g3601_3700/" +
                                    "s3673_find_zombie_sessions/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("S001"))
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("201"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("35"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("6"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
