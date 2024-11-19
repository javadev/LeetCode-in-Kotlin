package g1301_1400.s1393_capital_gainloss

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
        "CREATE TABLE Stocks(stock_name VARCHAR, operation VARCHAR," +
            " operation_day INTEGER, price INTEGER); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Leetcode', 'Buy', 1, 1000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Buy', 2, 10); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Leetcode', 'Sell', 5, 9000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Handbags', 'Buy', 17, 30000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Sell', 3, 1010); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Buy', 4, 1000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Sell', 5, 500); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Buy', 6, 1000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Handbags', 'Sell', 29, 7000); " +
            "INSERT INTO Stocks(stock_name, operation, operation_day, price)" +
            " VALUES ('Corona Masks', 'Sell', 10, 10000); ",
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
                            "src/main/kotlin/g1301_1400/s1393_" +
                                "capital_gainloss" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Corona Masks"))
                    assertThat(resultSet.getInt(2), equalTo(9500))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Handbags"))
                    assertThat(resultSet.getInt(2), equalTo(-23000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Leetcode"))
                    assertThat(resultSet.getInt(2), equalTo(8000))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
