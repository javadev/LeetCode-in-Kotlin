package g1201_1300.s1211_queries_quality_and_percentage

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
        "CREATE TABLE Queries(query_name VARCHAR, result VARCHAR, position INTEGER, rating INTEGER); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Dog', 'Golden Retriever', 1, 5); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Dog', 'German Shepherd', 2, 5); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Dog', 'Mule', 200, 1); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Cat', 'Shirazi', 5, 2); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Cat', 'Siamese', 3, 3); " +
            "INSERT INTO Queries(query_name, result, position, rating)" +
            " VALUES ('Cat', 'Sphynx', 7, 4); ",
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
                            "src/main/kotlin/g1201_1300/s1211_queries_quality_and_percentage/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Cat"))
                    assertThat(resultSet.getDouble(2), equalTo(0.33))
                    assertThat(resultSet.getDouble(3), equalTo(0.0))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Dog"))
                    assertThat(resultSet.getDouble(2), equalTo(2.33))
                    assertThat(resultSet.getDouble(3), equalTo(0.0))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
