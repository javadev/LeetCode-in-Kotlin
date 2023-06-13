package g1401_1500.s1484_group_sold_products_by_the_date

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
        "CREATE TABLE Activities(sell_date DATE, product VARCHAR); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-05-30', 'Headphone'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-06-01', 'Pencil'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-06-02', 'Mask'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-05-30', 'Basketball'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-06-01', 'Bible'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-06-02', 'Mask'); " +
            "INSERT INTO Activities(sell_date, product)" +
            " VALUES ('2020-05-30', 'T-Shirt'); "
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
                            "src/main/kotlin/g1401_1500/s1484_group_sold_" +
                                "products_by_the_date/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-05-30"))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(
                        resultSet.getNString(3),
                        equalTo("Basketball,Headphone,T-Shirt")
                    )
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-06-01"))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.getNString(3), equalTo("Bible,Pencil"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-06-02"))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.getNString(3), equalTo("Mask"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
