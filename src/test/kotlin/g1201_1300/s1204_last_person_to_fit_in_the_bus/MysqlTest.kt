package g1201_1300.s1204_last_person_to_fit_in_the_bus

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
        "CREATE TABLE Queue(person_id INTEGER, person_name VARCHAR, weight INTEGER, turn INTEGER); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (5, 'Alice', 250, 1); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (4, 'Bob', 175, 5); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (3, 'Alex', 350, 2); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (6, 'John Cena', 400, 3); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (1, 'Winston', 500, 6); " +
            "INSERT INTO Queue(person_id, person_name, weight, turn)" +
            " VALUES (2, 'Marie', 200, 4); ",
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
                            "src/main/kotlin/g1201_1300/s1204_last_person_to_fit_in_the_bus/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("John Cena"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
