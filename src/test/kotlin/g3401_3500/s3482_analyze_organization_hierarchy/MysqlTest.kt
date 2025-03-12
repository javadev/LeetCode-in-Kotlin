package g3401_3500.s3482_analyze_organization_hierarchy

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.ResultSet
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        (
            "    CREATE TABLE Employees (" +
                "    employee_id INT," +
                "    employee_name VARCHAR(50)," +
                "    manager_id INT," +
                "    salary INT," +
                "    department VARCHAR(100)" +
                ");" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(1, 'Alice', NULL, 12000, 'Executive');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(2, 'Bob', 1, 10000, 'Sales');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(3, 'Charlie', 1, 10000, 'Engineering');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(4, 'David', 2, 7500, 'Sales');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(5, 'Eva', 2, 7500, 'Sales');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(6, 'Frank', 3, 9000, 'Engineering');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(7, 'Grace', 3, 8500, 'Engineering');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(8, 'Hank', 4, 6000, 'Sales');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(9, 'Ivy', 6, 7000, 'Engineering');" +
                "insert into Employees (employee_id, employee_name, manager_id, salary, department) values " +
                "(10, 'Judy', 6, 7000, 'Engineering');"
            ),
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
                            (
                                "src/main/kotlin/g3401_3500/" +
                                    "s3482_analyze_organization_hierarchy/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    checkRow(resultSet, arrayOf<String>("1", "Alice", "1", "9", "84500"))
                    checkRow(resultSet, arrayOf<String>("3", "Charlie", "2", "4", "41500"))
                    checkRow(resultSet, arrayOf<String>("2", "Bob", "2", "3", "31000"))
                    checkRow(resultSet, arrayOf<String>("6", "Frank", "3", "2", "23000"))
                    checkRow(resultSet, arrayOf<String>("4", "David", "3", "1", "13500"))
                    checkRow(resultSet, arrayOf<String>("7", "Grace", "3", "0", "8500"))
                    checkRow(resultSet, arrayOf<String>("5", "Eva", "3", "0", "7500"))
                    checkRow(resultSet, arrayOf<String>("9", "Ivy", "4", "0", "7000"))
                    checkRow(resultSet, arrayOf<String>("10", "Judy", "4", "0", "7000"))
                    checkRow(resultSet, arrayOf<String>("8", "Hank", "4", "0", "6000"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }

    @Throws(SQLException::class)
    private fun checkRow(resultSet: ResultSet, values: Array<String>) {
        assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
        assertThat<String>(resultSet.getNString(1), equalTo<String>(values[0]))
        assertThat<String>(resultSet.getNString(2), equalTo<String>(values[1]))
        assertThat<String>(resultSet.getNString(3), equalTo<String>(values[2]))
        assertThat<String>(resultSet.getNString(4), equalTo<String>(values[3]))
        assertThat<String>(resultSet.getNString(5), equalTo<String>(values[4]))
    }
}
