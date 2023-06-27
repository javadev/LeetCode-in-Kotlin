package g0501_0600.s0577_employee_bonus

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
        "CREATE TABLE Employee(empId INTEGER PRIMARY KEY, name VARCHAR(512)" +
            ", supervisor INTEGER, salary INTEGER); " +
            "INSERT INTO Employee(empId, name" +
            ", supervisor, salary)" +
            " VALUES (3, 'Brad', NULL, 4000); " +
            "INSERT INTO Employee(empId, name" +
            ", supervisor, salary)" +
            " VALUES (1, 'John', 3, 1000); " +
            "INSERT INTO Employee(empId, name" +
            ", supervisor, salary)" +
            " VALUES (2, 'Dan', 3, 2000); " +
            "INSERT INTO Employee(empId, name" +
            ", supervisor, salary)" +
            " VALUES (4, 'Thomas', 3, 4000); " +
            "CREATE TABLE Bonus(empId INTEGER, bonus INTEGER); " +
            "INSERT INTO Bonus(empId, bonus)" +
            " VALUES (2, 500); " +
            "INSERT INTO Bonus(empId, bonus)" +
            " VALUES (4, 2000); "
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
                            "src/main/kotlin/g0501_0600/" +
                                "s0577_employee_bonus/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("John"))
                    assertThat(resultSet.getNString(2), equalTo(null))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Dan"))
                    assertThat(resultSet.getInt(2), equalTo(500))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Brad"))
                    assertThat(resultSet.getNString(2), equalTo(null))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
