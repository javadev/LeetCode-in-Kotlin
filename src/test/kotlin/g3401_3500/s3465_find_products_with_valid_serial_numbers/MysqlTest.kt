package g3401_3500.s3465_find_products_with_valid_serial_numbers

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
            "    CREATE TABLE products (" +
                "    product_id INT," +
                "    product_name VARCHAR(50)," +
                "    description VARCHAR(100)" +
                ");" +
                "insert into products (product_id, product_name, description) values " +
                "(1, 'Widget A', 'This is a sample product with SN1234-5678');" +
                "insert into products (product_id, product_name, description) values " +
                "(2, 'Widget B', 'A product with serial SN9876-1234 in the description');" +
                "insert into products (product_id, product_name, description) values " +
                "(3, 'Widget C', 'Product SN1234-56789 is available now');" +
                "insert into products (product_id, product_name, description) values " +
                "(4, 'Widget D', 'No serial number here');" +
                "insert into products (product_id, product_name, description) values " +
                "(5, 'Widget E', 'Check out SN4321-8765 in this description');"
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
                                "src/main/kotlin/g3401_3500/" +
                                    "s3465_find_products_with_valid_serial_numbers/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Widget A"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("This is a sample product with SN1234-5678"),
                    )
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("2"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Widget B"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("A product with serial SN9876-1234 in the description"),
                    )
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("5"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Widget E"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Check out SN4321-8765 in this description"),
                    )
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
