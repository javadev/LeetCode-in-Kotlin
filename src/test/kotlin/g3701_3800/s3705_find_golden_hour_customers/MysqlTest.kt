package g3701_3800.s3705_find_golden_hour_customers

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
            "CREATE TABLE restaurant_orders (" +
                "    order_id INTEGER," +
                "    customer_id INTEGER NOT NULL," +
                "    order_timestamp DATETIME NOT NULL," +
                "    order_amount DECIMAL(10,2) NOT NULL," +
                "    payment_method VARCHAR(20) NOT NULL," +
                "    order_rating INTEGER" +
                ");" +
                "INSERT INTO restaurant_orders (order_id, customer_id, " +
                "order_timestamp, order_amount, payment_method, order_rating) VALUES" +
                "(1, 101, '2024-03-01 12:30:00', 25.50, 'card', 5)," +
                "(2, 101, '2024-03-02 19:15:00', 32.00, 'app', 4)," +
                "(3, 101, '2024-03-03 13:45:00', 28.75, 'card', 5)," +
                "(4, 101, '2024-03-04 20:30:00', 41.00, 'app', NULL)," +
                "(5, 102, '2024-03-01 11:30:00', 18.50, 'cash', 4)," +
                "(6, 102, '2024-03-02 12:00:00', 22.00, 'card', 3)," +
                "(7, 102, '2024-03-03 15:30:00', 19.75, 'cash', NULL)," +
                "(8, 103, '2024-03-01 19:00:00', 55.00, 'app', 5)," +
                "(9, 103, '2024-03-02 20:45:00', 48.50, 'app', 4)," +
                "(10, 103, '2024-03-03 18:30:00', 62.00, 'card', 5)," +
                "(11, 104, '2024-03-01 10:00:00', 15.00, 'cash', 3)," +
                "(12, 104, '2024-03-02 09:30:00', 18.00, 'cash', 2)," +
                "(13, 104, '2024-03-03 16:00:00', 20.00, 'card', 3)," +
                "(14, 105, '2024-03-01 12:15:00', 30.00, 'app', 4)," +
                "(15, 105, '2024-03-02 13:00:00', 35.50, 'app', 5)," +
                "(16, 105, '2024-03-03 11:45:00', 28.00, 'card', 4);"
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
                                "src/main/kotlin/g3701_3800/" +
                                    "s3705_find_golden_hour_customers/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getString(1), equalTo<String>("103"))
                    assertThat<String>(resultSet.getString(2), equalTo<String>("3"))
                    assertThat<String>(resultSet.getString(3), equalTo<String>("100"))
                    assertThat<String>(resultSet.getString(4), equalTo<String>("4.67"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getString(1), equalTo<String>("101"))
                    assertThat<String>(resultSet.getString(2), equalTo<String>("4"))
                    assertThat<String>(resultSet.getString(3), equalTo<String>("100"))
                    assertThat<String>(resultSet.getString(4), equalTo<String>("4.67"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getString(1), equalTo<String>("105"))
                    assertThat<String>(resultSet.getString(2), equalTo<String>("3"))
                    assertThat<String>(resultSet.getString(3), equalTo<String>("100"))
                    assertThat<String>(resultSet.getString(4), equalTo<String>("4.33"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
