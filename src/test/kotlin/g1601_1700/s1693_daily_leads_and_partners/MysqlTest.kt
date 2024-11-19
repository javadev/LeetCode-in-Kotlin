package g1601_1700.s1693_daily_leads_and_partners

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
        "CREATE TABLE DailySales(date_id DATE, make_name VARCHAR, lead_id INTEGER," +
            " partner_id INTEGER); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-8', 'toyota', 0, 1); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-8', 'toyota', 1, 0); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-8', 'toyota', 1, 2); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-7', 'toyota', 0, 2); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-7', 'toyota', 0, 1); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-8', 'honda', 1, 2); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-8', 'honda', 2, 1); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-7', 'honda', 0, 1); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-7', 'honda', 1, 2); " +
            "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) " +
            " VALUES ('2020-12-7', 'honda', 2, 1); ",
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
                            "src/main/kotlin/g1601_1700/s1693_daily_le" +
                                "ads_and_partners/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-07"))
                    assertThat(resultSet.getNString(2), equalTo("honda"))
                    assertThat(resultSet.getInt(3), equalTo(3))
                    assertThat(resultSet.getInt(4), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-07"))
                    assertThat(resultSet.getNString(2), equalTo("toyota"))
                    assertThat(resultSet.getInt(3), equalTo(1))
                    assertThat(resultSet.getInt(4), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-08"))
                    assertThat(resultSet.getNString(2), equalTo("honda"))
                    assertThat(resultSet.getInt(3), equalTo(2))
                    assertThat(resultSet.getInt(4), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-08"))
                    assertThat(resultSet.getNString(2), equalTo("toyota"))
                    assertThat(resultSet.getInt(3), equalTo(2))
                    assertThat(resultSet.getInt(4), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
