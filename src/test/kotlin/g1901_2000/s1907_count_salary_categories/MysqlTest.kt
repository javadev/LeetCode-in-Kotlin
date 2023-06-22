package g1901_2000.s1907_count_salary_categories

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
        "CREATE TABLE Accounts(account_id INTEGER, income INTEGER); " +
            "INSERT INTO Accounts(account_id, income)" +
            " VALUES (3, 108939); " +
            "INSERT INTO Accounts(account_id, income)" +
            " VALUES (2, 12747); " +
            "INSERT INTO Accounts(account_id, income)" +
            " VALUES (8, 87709); " +
            "INSERT INTO Accounts(account_id, income)" +
            " VALUES (6, 91796); "
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
                            "src/main/kotlin/g1901_2000/" +
                                "s1907_count_salary_categories/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("High Salary"))
                    assertThat(resultSet.getInt(2), equalTo(3))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Low Salary"))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Average Salary"))
                    assertThat(resultSet.getInt(2), equalTo(0))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
