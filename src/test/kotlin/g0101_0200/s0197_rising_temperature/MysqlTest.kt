package g0101_0200.s0197_rising_temperature

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
import java.util.stream.Collectors.joining
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        "CREATE TABLE Weather(id INTEGER PRIMARY KEY, recordDate DATE, temperature INTEGER); " +
            "INSERT INTO Weather(id, recordDate, temperature) VALUES (1, '2015-01-01', 10); " +
            "INSERT INTO Weather(id, recordDate, temperature) VALUES (2, '2015-01-02', 25); " +
            "INSERT INTO Weather(id, recordDate, temperature) VALUES (3, '2015-01-03', 20); " +
            "INSERT INTO Weather(id, recordDate, temperature) VALUES (4, '2015-01-04', 30); ",
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
                            "src/main/kotlin/g0101_0200/s0197_rising_temperature/script.sql",
                        ),
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                        .replace(
                            "ADDDATE(FirstDate.recordDate,1)",
                            "TIMESTAMPADD(DAY, 1, FirstDate.recordDate)",
                        ),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(4))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
