package g0101_0200.s0182_duplicate_emails

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
    initialSqls = [
        "CREATE TABLE Person(id INTEGER PRIMARY KEY, email VARCHAR); " +
            "INSERT INTO Person(id, email) VALUES (1, 'a@b.com'); " +
            "INSERT INTO Person(id, email) VALUES (2, 'c@d.com'); " +
            "INSERT INTO Person(id, email) VALUES (3, 'a@b.com'); "
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
                            "src/main/kotlin/g0101_0200/s0182_duplicate_emails/script.sql"
                        )
                    )
                        .lines()
                        .collect(joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("a@b.com"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
