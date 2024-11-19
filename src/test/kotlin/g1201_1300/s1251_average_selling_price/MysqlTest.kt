package g1201_1300.s1251_average_selling_price

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
        "CREATE TABLE Prices(product_id INTEGER, start_date DATE, end_date DATE, price INTEGER); " +
            "INSERT INTO Prices(product_id, start_date, end_date, price)" +
            " VALUES (1, '2019-02-17', '2019-02-28', 5); " +
            "INSERT INTO Prices(product_id, start_date, end_date, price)" +
            " VALUES (1, '2019-03-01', '2019-03-22', 20); " +
            "INSERT INTO Prices(product_id, start_date, end_date, price)" +
            " VALUES (2, '2019-02-01', '2019-02-20', 15); " +
            "INSERT INTO Prices(product_id, start_date, end_date, price)" +
            " VALUES (2, '2019-02-21', '2019-03-31', 30); " +
            "CREATE TABLE UnitsSold(product_id INTEGER, purchase_date DATE, units INTEGER); " +
            "INSERT INTO UnitsSold(product_id, purchase_date, units)" +
            " VALUES (1, '2019-02-25', 100); " +
            "INSERT INTO UnitsSold(product_id, purchase_date, units)" +
            " VALUES (1, '2019-03-01', 15); " +
            "INSERT INTO UnitsSold(product_id, purchase_date, units)" +
            " VALUES (2, '2019-02-10', 200); " +
            "INSERT INTO UnitsSold(product_id, purchase_date, units)" +
            " VALUES (2, '2019-03-22', 30); ",
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
                            "src/main/kotlin/g1201_1300/s1251_average_selling_price/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getDouble(2), equalTo(6.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getDouble(2), equalTo(16.0))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
