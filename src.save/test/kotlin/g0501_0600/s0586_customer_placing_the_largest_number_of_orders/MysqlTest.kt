package g0501_0600.s0586_customer_placing_the_largest_number_of_orders

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
        "CREATE TABLE Orders(order_number INTEGER, customer_number INTEGER); " +
            "INSERT INTO Orders(order_number, customer_number) VALUES (1, 1); " +
            "INSERT INTO Orders(order_number, customer_number) VALUES (2, 2); " +
            "INSERT INTO Orders(order_number, customer_number) VALUES (3, 3); " +
            "INSERT INTO Orders(order_number, customer_number) VALUES (4, 3); "
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
                            "src/main/kotlin/g0501_0600/" +
                                "s0586_customer_placing" +
                                "_the_largest_number_of" +
                                "_orders/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
