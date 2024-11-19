package g0601_0700.s0610_triangle_judgement

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
        "CREATE TABLE Triangle(x INTEGER, y INTEGER, z INTEGER); " +
            "INSERT INTO Triangle(x, y, z)" +
            " VALUES (13, 15, 30); " +
            "INSERT INTO Triangle(x, y, z)" +
            " VALUES (10, 20, 15); ",
    ],
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.getConnection().use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            "src/main/kotlin/g0601_0700/" +
                                "s0610_triangle_judgement/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(13))
                    assertThat(resultSet.getInt(2), equalTo(15))
                    assertThat(resultSet.getInt(3), equalTo(30))
                    assertThat(resultSet.getNString(4), equalTo("No"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(10))
                    assertThat(resultSet.getInt(2), equalTo(20))
                    assertThat(resultSet.getInt(3), equalTo(15))
                    assertThat(resultSet.getNString(4), equalTo("Yes"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
