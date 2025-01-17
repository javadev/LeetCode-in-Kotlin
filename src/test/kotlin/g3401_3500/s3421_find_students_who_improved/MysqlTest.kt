package g3401_3500.s3421_find_students_who_improved

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
            "    CREATE TABLE Scores (" +
                "    student_id INT," +
                "    subject VARCHAR(50)," +
                "    score INT," +
                "    exam_date VARCHAR(10)" +
                ");" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('101', 'Math', '70', '15-01-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('101', 'Math', '85', '15-02-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('101', 'Physics', '65', '15-01-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('101', 'Physics', '60', '15-02-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('102', 'Math', '80', '15-01-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('102', 'Math', '85', '15-02-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('103', 'Math', '90', '15-01-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('104', 'Physics', '75', '15-01-2023');" +
                "insert into Scores (student_id, subject, score, exam_date) values " +
                "('104', 'Physics', '85', '15-02-2023');"
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
                            "src/main/kotlin/g3401_3500/" +
                                "s3421_find_students_who_improved/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("101"))
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("Math"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("70"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("85"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("102"))
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("Math"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("80"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("85"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("104"))
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("Physics"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("75"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("85"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
