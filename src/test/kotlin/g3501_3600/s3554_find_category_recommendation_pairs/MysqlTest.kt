package g3501_3600.s3554_find_category_recommendation_pairs

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
            "CREATE TABLE ProductPurchases(user_id INTEGER, product_id INTEGER" +
                ", quantity INTEGER); " +
                "INSERT INTO ProductPurchases(user_id, product_id, quantity)" +
                " VALUES " +
                "(1, 101, 2), " +
                "(1, 102, 1), " +
                "(1, 201, 3), " +
                "(1, 301, 1), " +
                "(2, 101, 1), " +
                "(2, 102, 2), " +
                "(2, 103, 1), " +
                "(2, 201, 5), " +
                "(3, 101, 2), " +
                "(3, 103, 1), " +
                "(3, 301, 4), " +
                "(3, 401, 2), " +
                "(4, 101, 1), " +
                "(4, 201, 3), " +
                "(4, 301, 1), " +
                "(4, 401, 2), " +
                "(5, 102, 2), " +
                "(5, 103, 1), " +
                "(5, 201, 2), " +
                "(5, 202, 3);" +
                "CREATE TABLE ProductInfo(product_id INTEGER, category VARCHAR(255)" +
                ", price INTEGER); " +
                "INSERT INTO ProductInfo(product_id, category, price) VALUES " +
                "(101, 'Electronics', 100), " +
                "(102, 'Books', 20), " +
                "(103, 'Books', 35), " +
                "(201, 'Clothing', 45), " +
                "(202, 'Clothing', 60), " +
                "(301, 'Sports', 75), " +
                "(401, 'Kitchen', 50);"
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
                                    "s3554_find_category_recommendation_pairs/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("Books"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Clothing"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("Books"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Electronics"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(
                        resultSet.getNString(1),
                        equalTo<String>("Clothing"),
                    )
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Electronics"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(
                        resultSet.getNString(1),
                        equalTo<String>("Electronics"),
                    )
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("Sports"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
