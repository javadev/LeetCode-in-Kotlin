package g0501_0600.s0570_managers_with_at_least_5_direct_reports

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
        "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR(512)" +
            ", department VARCHAR(512), managerId INTEGER); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (101, 'John', 'A', NULL); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (102, 'Dan', 'A', 101); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (103, 'James', 'A', 101); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (104, 'Amy', 'A', 101); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (105, 'Anne', 'A', 101); " +
            "INSERT INTO Employee(id, name" +
            ", department, managerId)" +
            " VALUES (106, 'Ron', 'B', 101); ",
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
                            "src/main/kotlin/g0501_0600/" +
                                "s0570_managers_with_at_least_5_direct_reports" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("John"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
