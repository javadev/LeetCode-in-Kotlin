package g1901_2000.s1965_employees_with_missing_information

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
        "CREATE TABLE Employees(employee_id INTEGER, name VARCHAR); " +
            "INSERT INTO Employees(employee_id, name)" +
            " VALUES (2, 'Crew'); " +
            "INSERT INTO Employees(employee_id, name)" +
            " VALUES (4, 'Haven'); " +
            "INSERT INTO Employees(employee_id, name)" +
            " VALUES (5, 'Kristian'); " +
            "CREATE TABLE Salaries(employee_id INTEGER, salary INTEGER); " +
            "INSERT INTO Salaries(employee_id, salary)" +
            " VALUES (5, 76071); " +
            "INSERT INTO Salaries(employee_id, salary)" +
            " VALUES (1, 22517); " +
            "INSERT INTO Salaries(employee_id, salary)" +
            " VALUES (4, 63539); ",
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
                            "src/main/kotlin/g1901_2000/s1965_employees_" +
                                "with_missing_information/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
