package g0501_0600.s0584_find_customer_referee

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
        "CREATE TABLE Customer(id INTEGER PRIMARY KEY, name VARCHAR, referee_id INTEGER); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (1, 'Will', NULL); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (2, 'Jane', NULL); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (3, 'Alex', 2); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (4, 'Bill', NULL); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (5, 'Zack', 1); " +
            "INSERT INTO Customer(id, name, referee_id) VALUES (6, 'Mark', 2); "
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
                            "src/main/kotlin/g0501_0600/" +
                                "s0584_find_customer_referee/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getString(1), equalTo("Will"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getString(1), equalTo("Jane"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getString(1), equalTo("Bill"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getString(1), equalTo("Zack"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
