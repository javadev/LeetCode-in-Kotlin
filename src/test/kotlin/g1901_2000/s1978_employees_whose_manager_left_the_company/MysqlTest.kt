package g1901_2000.s1978_employees_whose_manager_left_the_company

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
        "CREATE TABLE Employees(employee_id INTEGER, name VARCHAR, manager_id INTEGER, salary INTEGER); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (3, 'Mila', 9, 60301); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (12, 'Antonella', null, 31000); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (13, 'Emery', null, 67084); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (1, 'Kalel', 11, 21241); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (9, 'Mikaela', null, 50937); " +
            "INSERT INTO Employees(employee_id, name, manager_id, salary)" +
            " VALUES (11, 'Joziah', 6, 28485); ",
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
                            "src/main/kotlin/g1901_2000/" +
                                "s1978_employees_whose_manager_left_the_company/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(11))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
