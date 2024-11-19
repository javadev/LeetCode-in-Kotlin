package g1101_1200.s1164_product_price_at_a_given_date

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
        "CREATE TABLE Products(product_id INTEGER, new_price INTEGER, change_date DATE); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (1, 20, '2019-08-14'); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (2, 50, '2019-08-14'); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (1, 30, '2019-08-15'); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (1, 35, '2019-08-16'); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (2, 65, '2019-08-17'); " +
            "INSERT INTO Products(product_id, new_price, change_date)" +
            " VALUES (3, 20, '2019-08-18'); ",
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
                            "src/main/kotlin/g1101_1200/s1164_product_price_at_a_given_date" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getInt(2), equalTo(35))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getInt(2), equalTo(50))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.getInt(2), equalTo(10))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
