package g0601_0700.s0626_exchange_seats

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
        "CREATE TABLE seat(id INTEGER PRIMARY KEY, student VARCHAR(512));" +
            "INSERT INTO seat(id, student) VALUES (1, 'Abbot'); " +
            "INSERT INTO seat(id, student) VALUES (2, 'Doris'); " +
            "INSERT INTO seat(id, student) VALUES (3, 'Emerson'); " +
            "INSERT INTO seat(id, student) VALUES (4, 'Green'); " +
            "INSERT INTO seat(id, student) VALUES (5, 'Jeames'); ",
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
                            "src/main/kotlin/g0601_0700/" +
                                "s0626_exchange_seats/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getNString(2), equalTo("Doris"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getNString(2), equalTo("Abbot"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.getNString(2), equalTo("Green"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(4))
                    assertThat(resultSet.getNString(2), equalTo("Emerson"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(5))
                    assertThat(resultSet.getNString(2), equalTo("Jeames"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
