package g1201_1300.s1280_students_and_examinations

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
        "CREATE TABLE Students(student_id INTEGER, student_name VARCHAR); " +
            "INSERT INTO Students(student_id, student_name)" +
            " VALUES (1, 'Alice'); " +
            "INSERT INTO Students(student_id, student_name)" +
            " VALUES (2, 'Bob'); " +
            "INSERT INTO Students(student_id, student_name)" +
            " VALUES (13, 'John'); " +
            "INSERT INTO Students(student_id, student_name)" +
            " VALUES (6, 'Alex'); " +
            "CREATE TABLE Subjects(subject_name VARCHAR); " +
            "INSERT INTO Subjects(subject_name)" +
            " VALUES ('Math'); " +
            "INSERT INTO Subjects(subject_name)" +
            " VALUES ('Physics'); " +
            "INSERT INTO Subjects(subject_name)" +
            " VALUES ('Programming'); " +
            "CREATE TABLE Examinations(student_id INTEGER, subject_name VARCHAR); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Math'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Physics'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Programming'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (2, 'Programming'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Physics'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Math'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (13, 'Math'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (13, 'Programming'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (13, 'Physics'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (2, 'Math'); " +
            "INSERT INTO Examinations(student_id, subject_name)" +
            " VALUES (1, 'Math'); ",
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
                            "src/main/kotlin/g1201_1300/s1280_students_and_examinations/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getNString(2), equalTo("Alice"))
                    assertThat(resultSet.getNString(3), equalTo("Math"))
                    assertThat(resultSet.getInt(4), equalTo(3))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getNString(2), equalTo("Alice"))
                    assertThat(resultSet.getNString(3), equalTo("Physics"))
                    assertThat(resultSet.getInt(4), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.getNString(2), equalTo("Alice"))
                    assertThat(resultSet.getNString(3), equalTo("Programming"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getNString(2), equalTo("Bob"))
                    assertThat(resultSet.getNString(3), equalTo("Math"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getNString(2), equalTo("Bob"))
                    assertThat(resultSet.getNString(3), equalTo("Physics"))
                    assertThat(resultSet.getInt(4), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(2))
                    assertThat(resultSet.getNString(2), equalTo("Bob"))
                    assertThat(resultSet.getNString(3), equalTo("Programming"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(6))
                    assertThat(resultSet.getNString(2), equalTo("Alex"))
                    assertThat(resultSet.getNString(3), equalTo("Math"))
                    assertThat(resultSet.getInt(4), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(6))
                    assertThat(resultSet.getNString(2), equalTo("Alex"))
                    assertThat(resultSet.getNString(3), equalTo("Physics"))
                    assertThat(resultSet.getInt(4), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(6))
                    assertThat(resultSet.getNString(2), equalTo("Alex"))
                    assertThat(resultSet.getNString(3), equalTo("Programming"))
                    assertThat(resultSet.getInt(4), equalTo(0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(13))
                    assertThat(resultSet.getNString(2), equalTo("John"))
                    assertThat(resultSet.getNString(3), equalTo("Math"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(13))
                    assertThat(resultSet.getNString(2), equalTo("John"))
                    assertThat(resultSet.getNString(3), equalTo("Physics"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(13))
                    assertThat(resultSet.getNString(2), equalTo("John"))
                    assertThat(resultSet.getNString(3), equalTo("Programming"))
                    assertThat(resultSet.getInt(4), equalTo(1))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
