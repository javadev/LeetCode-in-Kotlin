package g3601_3700.s3626_find_stores_with_inventory_imbalance

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
            "CREATE TABLE stores (" +
                "    store_id INT PRIMARY KEY," +
                "    store_name VARCHAR(50)," +
                "    location VARCHAR(50)" +
                ");" +
                "INSERT INTO stores (store_id, store_name, location) VALUES" +
                "(1, 'Downtown Tech', 'New York')," +
                "(2, 'Suburb Mall', 'Chicago')," +
                "(3, 'City Center', 'Los Angeles')," +
                "(4, 'Corner Shop', 'Miami')," +
                "(5, 'Plaza Store', 'Seattle');" +
                "CREATE TABLE inventory (" +
                "    inventory_id INT PRIMARY KEY," +
                "    store_id INT," +
                "    product_name VARCHAR(50)," +
                "    quantity INT," +
                "    price DECIMAL(10,2)," +
                "    FOREIGN KEY (store_id) REFERENCES stores(store_id)" +
                ");" +
                "INSERT INTO inventory (inventory_id, store_id, " +
                "product_name, quantity, price) VALUES" +
                "(1,  1, 'Laptop',     5,   999.99)," +
                "(2,  1, 'Mouse',      50,   19.99)," +
                "(3,  1, 'Keyboard',   25,   79.99)," +
                "(4,  1, 'Monitor',    15,  299.99)," +
                "(5,  2, 'Phone',      3,   699.99)," +
                "(6,  2, 'Charger',    100,  25.99)," +
                "(7,  2, 'Case',       75,   15.99)," +
                "(8,  2, 'Headphones', 20,  149.99)," +
                "(9,  3, 'Tablet',     2,   499.99)," +
                "(10, 3, 'Stylus',     80,   29.99)," +
                "(11, 3, 'Cover',      60,   39.99)," +
                "(12, 4, 'Watch',      10,  299.99)," +
                "(13, 4, 'Band',       25,   49.99)," +
                "(14, 5, 'Camera',     8,   599.99)," +
                "(15, 5, 'Lens',       12,  199.99);"
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
                                "src/main/kotlin/g3601_3700/" +
                                    "s3626_find_stores_with_" +
                                    "inventory_imbalance/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("3"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("City Center"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Los Angeles"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("Tablet"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("Stylus"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("40.00"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("2"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Suburb Mall"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Chicago"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("Phone"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("Case"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("25.00"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Downtown Tech"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("New York"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("Laptop"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("Mouse"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("10.00"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
