package g1301_1400.s1321_restaurant_growth

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
        "CREATE TABLE Customer(customer_id INTEGER, name VARCHAR," +
            " visited_on DATE, amount INTEGER); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (1, 'Jhon', '2019-01-01', 100); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (2, 'Daniel', '2019-01-02', 110); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (3, 'Jade', '2019-01-03', 120); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (4, 'Khaled', '2019-01-04', 130); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (5, 'Winston', '2019-01-05', 110); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (6, 'Elvis', '2019-01-06', 140); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (7, 'Anna', '2019-01-07', 150); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (8, 'Maria', '2019-01-08', 80); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (9, 'Jaze', '2019-01-09', 110); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (1, 'Jhon', '2019-01-10', 130); " +
            "INSERT INTO Customer(customer_id, name, visited_on, amount)" +
            " VALUES (3, 'Jaze', '2019-01-10', 150); "
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
                            "src/main/kotlin/g1301_1400/s1321_restaurant_growth" +
                                "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01-07"))
                    assertThat(resultSet.getInt(2), equalTo(860))
                    assertThat(resultSet.getDouble(3), equalTo(122.86))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01-08"))
                    assertThat(resultSet.getInt(2), equalTo(840))
                    assertThat(resultSet.getDouble(3), equalTo(120.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01-09"))
                    assertThat(resultSet.getInt(2), equalTo(840))
                    assertThat(resultSet.getDouble(3), equalTo(120.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2019-01-10"))
                    assertThat(resultSet.getInt(2), equalTo(1000))
                    assertThat(resultSet.getDouble(3), equalTo(142.86))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
