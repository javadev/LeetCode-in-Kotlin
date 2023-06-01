package g0601_0700.s0627_swap_salary

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
        "CREATE TABLE Salary(id INTEGER PRIMARY KEY, name" +
            " VARCHAR, sex VARCHAR, salary INTEGER); " +
            "INSERT INTO Salary(id, name, sex, salary)" +
            " VALUES (1, 'A', 'm', 2500); " +
            "INSERT INTO Salary(id, name, sex, salary)" +
            " VALUES (2, 'B', 'f', 1500); " +
            "INSERT INTO Salary(id, name, sex, salary)" +
            " VALUES (3, 'C', 'm', 5500); " +
            "INSERT INTO Salary(id, name, sex, salary)" +
            " VALUES (4, 'D', 'f', 500); "
    ]
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.connection.use { connection ->
            connection.createStatement().use { statement ->
                statement.executeUpdate(
                    BufferedReader(
                        FileReader(
                            "src/main/kotlin/g0601_0700/" +
                                "s0627_swap_salary/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                )
                val resultSet = statement.executeQuery("select id, name, sex, salary from Salary")
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getInt(1), equalTo(1))
                assertThat(resultSet.getNString(2), equalTo("A"))
                assertThat(resultSet.getNString(3), equalTo("f"))
                assertThat(resultSet.getInt(4), equalTo(2500))
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getInt(1), equalTo(2))
                assertThat(resultSet.getNString(2), equalTo("B"))
                assertThat(resultSet.getNString(3), equalTo("m"))
                assertThat(resultSet.getInt(4), equalTo(1500))
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getInt(1), equalTo(3))
                assertThat(resultSet.getNString(2), equalTo("C"))
                assertThat(resultSet.getNString(3), equalTo("f"))
                assertThat(resultSet.getInt(4), equalTo(5500))
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getInt(1), equalTo(4))
                assertThat(resultSet.getNString(2), equalTo("D"))
                assertThat(resultSet.getNString(3), equalTo("m"))
                assertThat(resultSet.getInt(4), equalTo(500))
                assertThat(resultSet.next(), equalTo(false))
            }
        }
    }
}
