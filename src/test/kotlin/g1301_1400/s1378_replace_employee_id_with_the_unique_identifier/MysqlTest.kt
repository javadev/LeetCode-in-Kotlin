package g1301_1400.s1378_replace_employee_id_with_the_unique_identifier

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
        "CREATE TABLE Employees(id INTEGER, name VARCHAR); " +
            "INSERT INTO Employees(id, name)" +
            " VALUES (1, 'Alice'); " +
            "INSERT INTO Employees(id, name)" +
            " VALUES (7, 'Bob'); " +
            "INSERT INTO Employees(id, name)" +
            " VALUES (11, 'Meir'); " +
            "INSERT INTO Employees(id, name)" +
            " VALUES (90, 'Winston'); " +
            "INSERT INTO Employees(id, name)" +
            " VALUES (3, 'Jonathan'); " +
            "CREATE TABLE EmployeeUNI(id INTEGER, unique_id INTEGER); " +
            "INSERT INTO EmployeeUNI(id, unique_id)" +
            " VALUES (3, 1); " +
            "INSERT INTO EmployeeUNI(id, unique_id)" +
            " VALUES (11, 2); " +
            "INSERT INTO EmployeeUNI(id, unique_id)" +
            " VALUES (90, 3); ",
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
                            "src/main/kotlin/g1301_1400/s1378_replace_employee_id_with_the_unique_identifier" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo(null))
                    assertThat(resultSet.getNString(2), equalTo("Alice"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo(null))
                    assertThat(resultSet.getNString(2), equalTo("Bob"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2"))
                    assertThat(resultSet.getNString(2), equalTo("Meir"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("3"))
                    assertThat(resultSet.getNString(2), equalTo("Winston"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("1"))
                    assertThat(resultSet.getNString(2), equalTo("Jonathan"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
