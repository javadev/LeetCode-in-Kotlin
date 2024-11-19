package g1701_1800.s1789_primary_department_for_each_employee

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
        "CREATE TABLE Employee(employee_id INTEGER, department_id INTEGER, " +
            "primary_flag VARCHAR); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (1, 1, 'N'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (2, 1, 'Y'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (2, 2, 'N'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (3, 3, 'N'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (4, 2, 'N'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (4, 3, 'Y'); " +
            "INSERT INTO Employee(employee_id, department_id, primary_flag) " +
            "VALUES (4, 4, 'N'); ",
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
                            "src/main/kotlin/g1701_1800/" +
                                "s1789_primary_department_for_each_employee/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(4))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
