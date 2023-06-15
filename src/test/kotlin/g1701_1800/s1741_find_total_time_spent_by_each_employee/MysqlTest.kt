package g1701_1800.s1741_find_total_time_spent_by_each_employee

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

@EmbeddedDatabaseTest(compatibilityMode = CompatibilityMode.MySQL, initialSqls = ["CREATE TABLE Employees(emp_id INTEGER, event_day DATE, in_time INTEGER, out_time INTEGER); "
        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
        + " VALUES (1, '2020-11-28', 4, 32); "
        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
        + " VALUES (1, '2020-11-28', 55, 200); "
        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
        + " VALUES (1, '2020-12-03', 1, 42); "
        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
        + " VALUES (2, '2020-11-28', 3, 33); "
        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
        + " VALUES (2, '2020-12-09', 47, 74); "])
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.connection.use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                        BufferedReader(
                                FileReader("src/main/kotlin/g1701_1800/s1741_find_total_time_"
                                        + "spent_by_each_employee/script.sql"))
                                .lines()
                                .collect(Collectors.joining("\n"))
                                .replace("#.*?\\r?\\n".toRegex(), "")).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-11-28"))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.getInt(3), equalTo(173))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-11-28"))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.getInt(3), equalTo(30))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-03"))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.getInt(3), equalTo(41))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("2020-12-09"))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.getInt(3), equalTo(27))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
