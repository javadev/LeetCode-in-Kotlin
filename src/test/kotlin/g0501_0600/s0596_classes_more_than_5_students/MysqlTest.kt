package g0501_0600.s0596_classes_more_than_5_students

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
        "CREATE TABLE Courses(student VARCHAR, class VARCHAR); " +
            "INSERT INTO Courses(student, class) VALUES ('A', 'Math'); " +
            "INSERT INTO Courses(student, class) VALUES ('B', 'English'); " +
            "INSERT INTO Courses(student, class) VALUES ('C', 'Math'); " +
            "INSERT INTO Courses(student, class) VALUES ('D', 'Biology'); " +
            "INSERT INTO Courses(student, class) VALUES ('E', 'Math'); " +
            "INSERT INTO Courses(student, class) VALUES ('F', 'Computer'); " +
            "INSERT INTO Courses(student, class) VALUES ('G', 'Math'); " +
            "INSERT INTO Courses(student, class) VALUES ('H', 'Math'); " +
            "INSERT INTO Courses(student, class) VALUES ('I', 'Math'); ",
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
                                "s0596_classes_more" +
                                "_than_5_students" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Math"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
