package g1101_1200.s1174_immediate_food_delivery_ii

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
        "CREATE TABLE Delivery(delivery_id INTEGER, customer_id INTEGER, order_date DATE, " +
            "customer_pref_delivery_date DATE); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (1, 1, '2019-08-01', '2019-08-02'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (2, 2, '2019-08-02', '2019-08-02'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (3, 1, '2019-08-11', '2019-08-12'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (4, 3, '2019-08-24', '2019-08-24'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (5, 3, '2019-08-21', '2019-08-22'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (6, 2, '2019-08-11', '2019-08-13'); " +
            "INSERT INTO Delivery(delivery_id, customer_id, order_date, customer_pref_delivery_date)" +
            " VALUES (7, 4, '2019-08-09', '2019-08-09'); "
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
                            "src/main/kotlin/g1101_1200/s1174_immediate_food_delivery_ii" +
                                "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(50.00))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
