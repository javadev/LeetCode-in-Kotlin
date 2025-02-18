package g3401_3500.s3451_find_invalid_ip_addresses

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
            "    CREATE TABLE logs (" +
                "    log_id INT," +
                "    ip VARCHAR(50)," +
                "    status_code INT" +
                ");" +
                "insert into logs (log_id, ip, status_code) values " +
                "(1, '192.168.1.1', 200);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(2, '256.1.2.3', 404);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(3, '192.168.001.1', 200);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(4, '192.168.1.1', 200);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(5, '192.168.1', 500);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(6, '256.1.2.3', 404);" +
                "insert into logs (log_id, ip, status_code) values " +
                "(7, '192.168.001.1', 200);"
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
                            "src/main/kotlin/g3401_3500/" +
                                "s3451_find_invalid_ip_addresses/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(true))
                    MatcherAssert.assertThat<String?>(
                        resultSet.getNString(1),
                        CoreMatchers.equalTo<String?>("256.1.2.3"),
                    )
                    MatcherAssert.assertThat<String?>(resultSet.getNString(2), CoreMatchers.equalTo<String?>("2"))
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(true))
                    MatcherAssert.assertThat<String?>(
                        resultSet.getNString(1),
                        CoreMatchers.equalTo<String?>("192.168.001.1"),
                    )
                    MatcherAssert.assertThat<String?>(resultSet.getNString(2), CoreMatchers.equalTo<String?>("2"))
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(true))
                    MatcherAssert.assertThat<String?>(
                        resultSet.getNString(1),
                        CoreMatchers.equalTo<String?>("192.168.1"),
                    )
                    MatcherAssert.assertThat<String?>(resultSet.getNString(2), CoreMatchers.equalTo<String?>("1"))
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(false))
                }
            }
        }
    }
}
