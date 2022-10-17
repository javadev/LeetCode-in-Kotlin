package g0101_0200.s0183_customers_who_never_order

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
        "CREATE TABLE Customers(id INTEGER PRIMARY KEY, name VARCHAR); " +
            "INSERT INTO Customers(id, name) VALUES (1, 'Joe'); " +
            "INSERT INTO Customers(id, name) VALUES (2, 'Henry'); " +
            "INSERT INTO Customers(id, name) VALUES (3, 'Sam'); " +
            "INSERT INTO Customers(id, name) VALUES (4, 'Max'); " +
            "CREATE TABLE Orders(id INTEGER, customerId INTEGER); " +
            "INSERT INTO Orders(id, customerId) VALUES (1, 3); " +
            "INSERT INTO Orders(id, customerId) VALUES (2, 1); "
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
                            "src/main/kotlin/g0101_0200/s0183_customers_who_never_order/script.sql"
                        )
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Henry"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Max"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
