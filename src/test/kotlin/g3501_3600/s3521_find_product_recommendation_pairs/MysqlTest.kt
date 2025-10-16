package g3501_3600.s3521_find_product_recommendation_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.ResultSet
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        (
            "    CREATE TABLE ProductPurchases (" +
                "    user_id INT," +
                "    product_id INT," +
                "    quantity INT" +
                ");" +
                "CREATE TABLE ProductInfo (" +
                "    product_id INT," +
                "    category VARCHAR(100)," +
                "    price BIGINT" +
                ");" +
                "INSERT INTO ProductPurchases (user_id, product_id, quantity)" +
                "VALUES" +
                "    (1       , 101        , 2)," +
                "    (1       , 102        , 1        )," +
                "    (1       , 103        , 3        )," +
                "    (2       , 101        , 1        )," +
                "    (2       , 102        , 5        )," +
                "    (2       , 104        , 1        )," +
                "    (3       , 101        , 2        )," +
                "    (3       , 103        , 1        )," +
                "    (3       , 105        , 4        )," +
                "    (4       , 101        , 1        )," +
                "    (4       , 102        , 1        )," +
                "    (4       , 103        , 2        )," +
                "    (4       , 104        , 3        )," +
                "    (5       , 102        , 2        )," +
                "    (5       , 104        , 1 );" +
                "INSERT INTO ProductInfo (product_id, category, price)" +
                "VALUES" +
                "    (101       , 'Electronics'        , 100)," +
                "    (102       , 'Books'        , 20)," +
                "    (103       , 'Clothing'        , 35)," +
                "    (104       , 'Kitchen'        , 50)," +
                "    (105       , 'Sports'        , 75);"
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
                                    "s3521_find_product_recommendation_pairs/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    checkRow(resultSet, arrayOf<String>("101", "102", "Electronics", "Books", "3"))
                    checkRow(resultSet, arrayOf<String>("101", "103", "Electronics", "Clothing", "3"))
                    checkRow(resultSet, arrayOf<String>("102", "104", "Books", "Clothing", "3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }

    @Throws(SQLException::class)
    private fun checkRow(resultSet: ResultSet, values: Array<String>) {
        assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
        assertThat<String>(resultSet.getNString(1), equalTo<String>(values[0]))
        assertThat<String>(resultSet.getNString(2), equalTo<String>(values[1]))
        assertThat<String>(resultSet.getNString(3), equalTo<String>(values[2]))
    }
}
