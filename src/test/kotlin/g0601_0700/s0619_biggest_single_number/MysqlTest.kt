package g0601_0700.s0619_biggest_single_number

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
        "CREATE TABLE MyNumbers(num INTEGER); " +
            "INSERT INTO MyNumbers(num) VALUES (8); " +
            "INSERT INTO MyNumbers(num) VALUES (8); " +
            "INSERT INTO MyNumbers(num) VALUES (3); " +
            "INSERT INTO MyNumbers(num) VALUES (3); " +
            "INSERT INTO MyNumbers(num) VALUES (1); " +
            "INSERT INTO MyNumbers(num) VALUES (4); " +
            "INSERT INTO MyNumbers(num) VALUES (5); " +
            "INSERT INTO MyNumbers(num) VALUES (6); "
    ]
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.getConnection().use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            "src/main/kotlin/g0601_0700/" +
                                "s0619_biggest_single_number/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(6))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
