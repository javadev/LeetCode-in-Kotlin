package g0501_0600.s0585_investments_in_2016

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
        "CREATE TABLE Insurance(pid INTEGER, tiv_2015 DECIMAL, tiv_2016 DECIMAL"
            + ", lat DECIMAL, lon DECIMAL); "
            + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
            + ", lat, lon)"
            + " VALUES (1, 10, 5, 10, 10); "
            + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
            + ", lat, lon)"
            + " VALUES (2, 20, 20, 20, 20); "
            + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
            + ", lat, lon)"
            + " VALUES (3, 10, 30, 20, 20); "
            + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
            + ", lat, lon)"
            + " VALUES (4, 10, 40, 40, 40); "
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
                            "src/main/kotlin/g0501_0600/"
                                + "s0585_investments_in_2016"
                                + "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(45.00))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
