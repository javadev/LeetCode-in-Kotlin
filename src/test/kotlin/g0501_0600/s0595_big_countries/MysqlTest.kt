package g0501_0600.s0595_big_countries

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
        "CREATE TABLE World(name VARCHAR, continent VARCHAR, area BIGINT," +
            " population BIGINT, gdp BIGINT); " +
            "INSERT INTO World(name, continent, area, population, gdp)" +
            " VALUES ('Afghanistan', 'Asia', 652230, 25500100, 20343000000); " +
            "INSERT INTO World(name, continent, area, population, gdp)" +
            " VALUES ('Albania', 'Europe', 28748, 2831741, 12960000000); " +
            "INSERT INTO World(name, continent, area, population, gdp)" +
            " VALUES ('Algeria', 'Africa', 2381741, 37100000, 188681000000); " +
            "INSERT INTO World(name, continent, area, population, gdp)" +
            " VALUES ('Andorra', 'Europe', 468, 78115, 3712000000); " +
            "INSERT INTO World(name, continent, area, population, gdp)" +
            " VALUES ('Angola', 'Africa', 1246700, 20609294, 100990000000); "
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
                            "src/main/kotlin/g0501_0600/" +
                                "s0595_big_countries" +
                                "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Afghanistan"))
                    assertThat(resultSet.getLong(2), equalTo(25500100L))
                    assertThat(resultSet.getLong(3), equalTo(652230L))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Algeria"))
                    assertThat(resultSet.getLong(2), equalTo(37100000L))
                    assertThat(resultSet.getLong(3), equalTo(2381741L))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
