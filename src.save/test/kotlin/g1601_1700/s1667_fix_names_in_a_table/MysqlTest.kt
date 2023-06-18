package g1601_1700.s1667_fix_names_in_a_table

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
        "CREATE TABLE Users(user_id INTEGER PRIMARY KEY, name VARCHAR); " +
            "INSERT INTO Users(user_id, name) VALUES (1, 'aLice'); " +
            "INSERT INTO Users(user_id, name) VALUES (2, 'bOB'); "
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
                            "src/main/kotlin/g1601_1700/s1667_fix_" +
                                "names_in_a_table/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(2), equalTo("Alice"))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(2), equalTo("Bob"))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
