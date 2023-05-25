package g1101_1200.s1179_reformat_department_table

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
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
        "CREATE TABLE department(id INTEGER, revenue INTEGER, \"month\" VARCHAR(512)); " +
            "INSERT INTO department(id, revenue, \"month\")" +
            " VALUES (1, 8000, 'Jan'); " +
            "INSERT INTO department(id, revenue, \"month\")" +
            " VALUES (2, 9000, 'Jan'); " +
            "INSERT INTO department(id, revenue, \"month\")" +
            " VALUES (3, 10000, 'Feb'); " +
            "INSERT INTO department(id, revenue, \"month\")" +
            " VALUES (1, 7000, 'Feb'); " +
            "INSERT INTO department(id, revenue, \"month\")" +
            " VALUES (1, 6000, 'Mar'); "
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
                            "src/main/kotlin/g1101_1200/s1179_reformat_" +
                                "department_table/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(1))
                    MatcherAssert.assertThat(resultSet.getInt(2), CoreMatchers.equalTo(8000))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(7000))
                    MatcherAssert.assertThat(resultSet.getInt(4), CoreMatchers.equalTo(6000))
                    MatcherAssert.assertThat(resultSet.getInt(5), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(6), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(7), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(8), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(9), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(10), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(11), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(12), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(13), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(2))
                    MatcherAssert.assertThat(resultSet.getInt(2), CoreMatchers.equalTo(9000))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(4), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(5), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(6), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(7), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(8), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(9), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(10), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(11), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(12), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(13), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(3))
                    MatcherAssert.assertThat(resultSet.getInt(2), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(3), CoreMatchers.equalTo(10000))
                    MatcherAssert.assertThat(resultSet.getInt(4), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(5), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(6), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(7), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(8), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(9), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(10), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(11), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(12), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.getInt(13), CoreMatchers.equalTo(0))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(false))
                }
            }
        }
    }
}
