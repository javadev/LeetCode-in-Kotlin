package g0101_0200.s0178_rank_scores

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
        "CREATE TABLE Scores(id INTEGER PRIMARY KEY, score float); " +
            "INSERT INTO Scores(id, score) VALUES (1, 3.50); " +
            "INSERT INTO Scores(id, score) VALUES (2, 3.65); " +
            "INSERT INTO Scores(id, score) VALUES (3, 4.00); " +
            "INSERT INTO Scores(id, score) VALUES (4, 3.85); " +
            "INSERT INTO Scores(id, score) VALUES (5, 4.00); " +
            "INSERT INTO Scores(id, score) VALUES (6, 3.65); ",
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
                            "src/main/kotlin/g0101_0200/s0178_rank_scores/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(4.0))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(4.0))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(3.85))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(3.65))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(3.65))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getDouble(1), equalTo(3.50))
                    assertThat(resultSet.getInt(2), equalTo(4))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
