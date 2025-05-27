package g3501_3600.s3564_seasonal_sales_analysis

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
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
            "CREATE TABLE sales(sale_id INTEGER, product_id INTEGER" +
                ", sale_date DATE, quantity INTEGER, price DECIMAL); " +
                "INSERT INTO sales (sale_id, product_id, sale_date, quantity, price) VALUES" +
                "(1, 1, '2023-01-15', 5, 10.00)," +
                "(2, 2, '2023-01-20', 4, 15.00)," +
                "(3, 3, '2023-03-10', 3, 18.00)," +
                "(4, 4, '2023-04-05', 1, 20.00)," +
                "(5, 1, '2023-05-20', 2, 10.00)," +
                "(6, 2, '2023-06-12', 4, 15.00)," +
                "(7, 5, '2023-06-15', 5, 12.00)," +
                "(8, 3, '2023-07-24', 2, 18.00)," +
                "(9, 4, '2023-08-01', 5, 20.00)," +
                "(10, 5, '2023-09-03', 3, 12.00)," +
                "(11, 1, '2023-09-25', 6, 10.00)," +
                "(12, 2, '2023-11-10', 4, 15.00)," +
                "(13, 3, '2023-12-05', 6, 18.00)," +
                "(14, 4, '2023-12-22', 3, 20.00)," +
                "(15, 5, '2024-02-14', 2, 12.00);" +
                "CREATE TABLE products(product_id INTEGER, product_name VARCHAR(255)" +
                ", category VARCHAR(255)); " +
                "INSERT INTO products (product_id, product_name, category) VALUES" +
                "(1, 'Warm Jacket', 'Apparel')," +
                "(2, 'Designer Jeans', 'Apparel')," +
                "(3, 'Cutting Board', 'Kitchen')," +
                "(4, 'Smart Speaker', 'Tech')," +
                "(5, 'Yoga Mat', 'Fitness');"
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
                                "src/main/kotlin/g3501_3600/" +
                                    "s3564_seasonal_sales_analysis/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*\\r\\n".toRegex(), ""),
                ).use { resultSet ->
                    MatcherAssert.assertThat<Boolean>(resultSet.next(), CoreMatchers.equalTo<Boolean>(true))
                    MatcherAssert.assertThat<String>(resultSet.getNString(1), CoreMatchers.equalTo<String>("Fall"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(2), CoreMatchers.equalTo<String>("Apparel"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(3), CoreMatchers.equalTo<String>("10"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(4), CoreMatchers.equalTo<String>("120"))
                    MatcherAssert.assertThat<Boolean>(resultSet.next(), CoreMatchers.equalTo<Boolean>(true))
                    MatcherAssert.assertThat<String>(resultSet.getNString(1), CoreMatchers.equalTo<String>("Spring"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(2), CoreMatchers.equalTo<String>("Kitchen"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(3), CoreMatchers.equalTo<String>("3"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(4), CoreMatchers.equalTo<String>("54"))
                    MatcherAssert.assertThat<Boolean>(resultSet.next(), CoreMatchers.equalTo<Boolean>(true))
                    MatcherAssert.assertThat<String>(resultSet.getNString(1), CoreMatchers.equalTo<String>("Summer"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(2), CoreMatchers.equalTo<String>("Tech"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(3), CoreMatchers.equalTo<String>("5"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(4), CoreMatchers.equalTo<String>("100"))
                    MatcherAssert.assertThat<Boolean>(resultSet.next(), CoreMatchers.equalTo<Boolean>(true))
                    MatcherAssert.assertThat<String>(resultSet.getNString(1), CoreMatchers.equalTo<String>("Winter"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(2), CoreMatchers.equalTo<String>("Apparel"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(3), CoreMatchers.equalTo<String>("9"))
                    MatcherAssert.assertThat<String>(resultSet.getNString(4), CoreMatchers.equalTo<String>("110"))
                    MatcherAssert.assertThat<Boolean>(resultSet.next(), CoreMatchers.equalTo<Boolean>(false))
                }
            }
        }
    }
}
