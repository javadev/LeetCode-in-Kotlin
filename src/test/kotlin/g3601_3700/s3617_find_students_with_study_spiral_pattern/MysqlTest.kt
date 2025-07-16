package g3601_3700.s3617_find_students_with_study_spiral_pattern

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
        (
            "CREATE TABLE students (" +
                "    student_id INT PRIMARY KEY," +
                "    student_name VARCHAR(50)," +
                "    major VARCHAR(50)" +
                ");" +
                "INSERT INTO students (student_id, student_name, major) VALUES" +
                "(1, 'Alice Chen', 'Computer Science')," +
                "(2, 'Bob Johnson', 'Mathematics')," +
                "(3, 'Carol Davis', 'Physics')," +
                "(4, 'David Wilson', 'Chemistry')," +
                "(5, 'Emma Brown', 'Biology');" +
                "CREATE TABLE study_sessions (" +
                "    session_id INT PRIMARY KEY," +
                "    student_id INT," +
                "    subject VARCHAR(30)," +
                "    session_date DATE," +
                "    hours_studied DECIMAL(3,1)" +
                ");" +
                "INSERT INTO study_sessions (session_id, student_id, " +
                "subject, session_date, hours_studied) VALUES" +
                "(1, 1, 'Math',       '2023-10-01', 2.5)," +
                "(2, 1, 'Physics',    '2023-10-02', 3.0)," +
                "(3, 1, 'Chemistry',  '2023-10-03', 2.0)," +
                "(4, 1, 'Math',       '2023-10-04', 2.5)," +
                "(5, 1, 'Physics',    '2023-10-05', 3.0)," +
                "(6, 1, 'Chemistry',  '2023-10-06', 2.0)," +
                "(7, 2, 'Algebra',    '2023-10-01', 4.0)," +
                "(8, 2, 'Calculus',   '2023-10-02', 3.5)," +
                "(9, 2, 'Statistics', '2023-10-03', 2.5)," +
                "(10, 2, 'Geometry',  '2023-10-04', 3.0)," +
                "(11, 2, 'Algebra',   '2023-10-05', 4.0)," +
                "(12, 2, 'Calculus',  '2023-10-06', 3.5)," +
                "(13, 2, 'Statistics','2023-10-07', 2.5)," +
                "(14, 2, 'Geometry',  '2023-10-08', 3.0)," +
                "(15, 3, 'Biology',   '2023-10-01', 2.0)," +
                "(16, 3, 'Chemistry', '2023-10-02', 2.5)," +
                "(17, 3, 'Biology',   '2023-10-03', 2.0)," +
                "(18, 3, 'Chemistry', '2023-10-04', 2.5)," +
                "(19, 4, 'Organic',   '2023-10-01', 3.0)," +
                "(20, 4, 'Physical',  '2023-10-05', 2.5);"
            ),
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
                            (
                                "src/main/kotlin/g3601_3700/" +
                                    "s3617_find_students_with_" +
                                    "study_spiral_pattern/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("2"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Bob Johnson"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Mathematics"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("4"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("26.0"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Alice Chen"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Computer Science"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("3"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("15.0"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
