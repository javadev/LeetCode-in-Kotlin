package g1801_1900.s1873_calculate_special_bonus

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
        "CREATE TABLE Employees(employee_id INTEGER PRIMARY KEY, name VARCHAR, salary INTEGER); " +
            "INSERT INTO Employees(employee_id, name, salary)" +
            " VALUES (2, 'Meir', 3000); " +
            "INSERT INTO Employees(employee_id, name, salary)" +
            " VALUES (3, 'Michael', 3800); " +
            "INSERT INTO Employees(employee_id, name, salary)" +
            " VALUES (7, 'Addilyn', 7400); " +
            "INSERT INTO Employees(employee_id, name, salary)" +
            " VALUES (8, 'Juan', 6100); " +
            "INSERT INTO Employees(employee_id, name, salary)" +
            " VALUES (9, 'Kannon', 7700); "
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
                            "src/main/kotlin/g1801_1900/s1873_calculat" +
                                "e_special_bonus/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getInt(2), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.getInt(2), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(7))
                    assertThat(resultSet.getInt(2), equalTo(7400))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(8))
                    assertThat(resultSet.getInt(2), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(9))
                    assertThat(resultSet.getInt(2), equalTo(7700))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
