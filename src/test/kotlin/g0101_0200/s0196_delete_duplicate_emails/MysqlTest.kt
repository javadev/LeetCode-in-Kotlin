package g0101_0200.s0196_delete_duplicate_emails

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
import java.util.stream.Collectors.joining
import javax.sql.DataSource


@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = ["CREATE TABLE Person(id INTEGER PRIMARY KEY, email VARCHAR); "
            + "INSERT INTO Person(id, email) VALUES (1, 'john@example.com'); "
            + "INSERT INTO Person(id, email) VALUES (2, 'bob@example.com'); "
            + "INSERT INTO Person(id, email) VALUES (3, 'john@example.com'); "]
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
                            "src/main/kotlin/g0101_0200/s0196_delete_duplicate_emails/script.sql"
                        )
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                )
                val resultSet = statement.executeQuery("select email from Person")
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getNString(1), equalTo("john@example.com"))
                assertThat(resultSet.next(), equalTo(true))
                assertThat(resultSet.getNString(1), equalTo("bob@example.com"))
                assertThat(resultSet.next(), equalTo(false))
            }
        }
    }
}