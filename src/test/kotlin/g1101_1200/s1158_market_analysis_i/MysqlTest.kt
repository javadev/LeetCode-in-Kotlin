package g1101_1200.s1158_market_analysis_i

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
        "CREATE TABLE users(user_id INTEGER, join_date DATE, favorite_brand VARCHAR(512)); " +
            "INSERT INTO users(user_id, join_date, favorite_brand)" +
            " VALUES (1, '2018-01-01', 'Lenovo'); " +
            "INSERT INTO users(user_id, join_date, favorite_brand)" +
            " VALUES (2, '2018-02-09', 'Samsung'); " +
            "INSERT INTO users(user_id, join_date, favorite_brand)" +
            " VALUES (3, '2018-01-19', 'LG'); " +
            "INSERT INTO users(user_id, join_date, favorite_brand)" +
            " VALUES (4, '2018-05-21', 'HP'); " +
            "CREATE TABLE orders(order_id INTEGER, order_date DATE, item_id INTEGER," +
            " buyer_id INTEGER, seller_id INTEGER); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (1, '2019-08-01', 4, 1, 2); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (2, '2018-08-02', 2, 1, 3); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (3, '2019-08-03', 3, 2, 3); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (4, '2018-08-04', 1, 4, 2); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (5, '2018-08-04', 1, 3, 4); " +
            "INSERT INTO orders(order_id, order_date, item_id, buyer_id, seller_id)" +
            " VALUES (6, '2019-08-05', 2, 2, 4); " +
            "CREATE TABLE items(item_id INTEGER, item_brand VARCHAR(512)); " +
            "INSERT INTO items(item_id, item_brand) VALUES (1, 'Samsung'); " +
            "INSERT INTO items(item_id, item_brand) VALUES (2, 'Lenovo'); " +
            "INSERT INTO items(item_id, item_brand) VALUES (3, 'LG'); " +
            "INSERT INTO items(item_id, item_brand) VALUES (4, 'HP'); "
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
                            "src/main/kotlin/g1101_1200/s1158_" +
                                "market_analysis_i/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(1))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("2018-01-01"))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(1))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(2))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("2018-02-09"))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(2))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(3))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("2018-01-19"))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(4))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("2018-05-21"))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(false))
                }
            }
        }
    }
}
