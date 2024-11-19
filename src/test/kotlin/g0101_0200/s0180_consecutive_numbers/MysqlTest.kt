package g0101_0200.s0180_consecutive_numbers

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
import java.util.stream.Collectors.joining
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        "CREATE TABLE Logs(id INTEGER PRIMARY KEY, num INTEGER); " +
            "INSERT INTO Logs(id, num) VALUES (1, 1); " +
            "INSERT INTO Logs(id, num) VALUES (2, 1); " +
            "INSERT INTO Logs(id, num) VALUES (3, 1); " +
            "INSERT INTO Logs(id, num) VALUES (4, 2); " +
            "INSERT INTO Logs(id, num) VALUES (5, 1); " +
            "INSERT INTO Logs(id, num) VALUES (6, 2); " +
            "INSERT INTO Logs(id, num) VALUES (7, 2); ",
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
                            "src/main/kotlin/g0101_0200/s0180_consecutive_numbers/script.sql",
                        ),
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
