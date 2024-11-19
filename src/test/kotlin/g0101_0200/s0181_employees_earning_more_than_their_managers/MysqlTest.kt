package g0101_0200.s0181_employees_earning_more_than_their_managers

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
        "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR," +
            " salary INTEGER, managerId INTEGER); " +
            "INSERT INTO Employee(id, name, salary, managerId) VALUES (1, 'Joe', 70000, 3); " +
            "INSERT INTO Employee(id, name, salary, managerId) VALUES (2, 'Henry', 80000, 4); " +
            "INSERT INTO Employee(id, name, salary, managerId) VALUES (3, 'Sam', 60000, NULL); " +
            "INSERT INTO Employee(id, name, salary, managerId) VALUES (4, 'Max', 90000, NULL); ",
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
                            "src/main/kotlin/g0101_0200/s0181_employees_earning_more_than_their_managers/script.sql",
                        ),
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Joe"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
