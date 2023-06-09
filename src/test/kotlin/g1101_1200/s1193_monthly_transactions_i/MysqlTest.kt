package g1101_1200.s1193_monthly_transactions_i

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
        "CREATE TABLE Transactions(id INTEGER, country VARCHAR, state VARCHAR, amount INTEGER, trans_date DATE); " +
            "INSERT INTO Transactions(id, country, state, amount, trans_date)" +
            " VALUES (121, 'US', 'approved', 1000, '2018-12-18'); " +
            "INSERT INTO Transactions(id, country, state, amount, trans_date)" +
            " VALUES (122, 'US', 'declined', 2000, '2018-12-19'); " +
            "INSERT INTO Transactions(id, country, state, amount, trans_date)" +
            " VALUES (123, 'US', 'approved', 2000, '2019-01-01'); " +
            "INSERT INTO Transactions(id, country, state, amount, trans_date)" +
            " VALUES (124, 'DE', 'approved', 2000, '2019-01-07'); "
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
                            "src/main/kotlin/g1101_1200/s1193_monthly_transactions_i" +
                                "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2018-12"))
                    assertThat(resultSet.getNString(2), equalTo("US"))
                    assertThat(resultSet.getInt(3), equalTo(2))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.getInt(5), equalTo(3000))
                    assertThat(resultSet.getInt(6), equalTo(1000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01"))
                    assertThat(resultSet.getNString(2), equalTo("DE"))
                    assertThat(resultSet.getInt(3), equalTo(1))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.getInt(5), equalTo(2000))
                    assertThat(resultSet.getInt(6), equalTo(2000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01"))
                    assertThat(resultSet.getNString(2), equalTo("US"))
                    assertThat(resultSet.getInt(3), equalTo(1))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.getInt(5), equalTo(2000))
                    assertThat(resultSet.getInt(6), equalTo(2000))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
