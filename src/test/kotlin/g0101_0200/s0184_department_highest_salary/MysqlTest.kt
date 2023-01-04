package g0101_0200.s0184_department_highest_salary

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
        "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR, salary INTEGER, departmentId INTEGER); " +
            "INSERT INTO Employee(id, name, salary, departmentId) VALUES (1, 'Joe', 70000, 1); " +
            "INSERT INTO Employee(id, name, salary, departmentId) VALUES (2, 'Jim', 90000, 1); " +
            "INSERT INTO Employee(id, name, salary, departmentId) VALUES (3, 'Henry', 80000, 2); " +
            "INSERT INTO Employee(id, name, salary, departmentId) VALUES (4, 'Sam', 60000, 2); " +
            "INSERT INTO Employee(id, name, salary, departmentId) VALUES (5, 'Max', 90000, 1); " +
            "CREATE TABLE Department(id INTEGER, name VARCHAR); " +
            "INSERT INTO Department(id, name) VALUES (1, 'IT'); " +
            "INSERT INTO Department(id, name) VALUES (2, 'Sales'); "
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
                            "src/main/kotlin/g0101_0200/s0184_department_highest_salary/script.sql"
                        )
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("IT"))
                    assertThat(resultSet.getNString(2), equalTo("Jim"))
                    assertThat(resultSet.getInt(3), equalTo(90000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Sales"))
                    assertThat(resultSet.getNString(2), equalTo("Henry"))
                    assertThat(resultSet.getInt(3), equalTo(80000))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("IT"))
                    assertThat(resultSet.getNString(2), equalTo("Max"))
                    assertThat(resultSet.getInt(3), equalTo(90000))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
