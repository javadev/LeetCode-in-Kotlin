package g2301_2400.s2356_number_of_unique_subjects_taught_by_each_teacher

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
        "CREATE TABLE Teacher(teacher_id INTEGER, subject_id INTEGER" +
            ", dept_id INTEGER); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (1, 2, 3); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (1, 2, 4); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (1, 3, 3); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (2, 1, 1); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (2, 2, 1); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (2, 3, 1); " +
            "INSERT INTO Teacher(teacher_id, subject_id, dept_id)" +
            " VALUES (2, 4, 1); "
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
                            "src/main/kotlin/g2301_2400/" +
                                "s2356_number_of_unique_subjects_taught_by_each_teacher/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getInt(2), equalTo(4))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
