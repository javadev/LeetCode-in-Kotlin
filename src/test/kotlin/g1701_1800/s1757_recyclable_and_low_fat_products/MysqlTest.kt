package g1701_1800.s1757_recyclable_and_low_fat_products

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
        "CREATE TABLE Products(product_id INTEGER PRIMARY KEY, low_fats VARCHAR, recyclable VARCHAR); " +
            "INSERT INTO Products(product_id, low_fats, recyclable)" +
            " VALUES (0, 'Y', 'N'); " +
            "INSERT INTO Products(product_id, low_fats, recyclable)" +
            " VALUES (1, 'Y', 'Y'); " +
            "INSERT INTO Products(product_id, low_fats, recyclable)" +
            " VALUES (2, 'N', 'Y'); " +
            "INSERT INTO Products(product_id, low_fats, recyclable)" +
            " VALUES (3, 'Y', 'Y'); " +
            "INSERT INTO Products(product_id, low_fats, recyclable)" +
            " VALUES (4, 'N', 'N'); "
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
                            "src/main/kotlin/g1701_1800/s1757_recyclable_and" +
                                "_low_fat_products/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
