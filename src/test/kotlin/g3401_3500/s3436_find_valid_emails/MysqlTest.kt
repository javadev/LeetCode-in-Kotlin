package g3401_3500.s3436_find_valid_emails

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
        (
            "CREATE TABLE Users(user_id INTEGER PRIMARY KEY, email VARCHAR(512)); " +
                "INSERT INTO Users(user_id, email)" +
                " VALUES (1, 'alice@example.com'); " +
                "INSERT INTO Users(user_id, email)" +
                " VALUES (2, 'bob_at_example.com'); " +
                "INSERT INTO Users(user_id, email)" +
                " VALUES (3, 'charlie@example.net'); " +
                "INSERT INTO Users(user_id, email)" +
                " VALUES (4, 'david@domain.com'); " +
                "INSERT INTO Users(user_id, email)" +
                " VALUES (5, 'eve@invalid'); "
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
                                "s3436_find_valid_emails/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(true))
                    MatcherAssert.assertThat<Int?>(resultSet.getInt(1), CoreMatchers.equalTo<Int?>(1))
                    MatcherAssert.assertThat<String?>(
                        resultSet.getNString(2),
                        CoreMatchers.equalTo<String?>("alice@example.com"),
                    )
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(true))
                    MatcherAssert.assertThat<Int?>(resultSet.getInt(1), CoreMatchers.equalTo<Int?>(4))
                    MatcherAssert.assertThat<String?>(
                        resultSet.getNString(2),
                        CoreMatchers.equalTo<String?>("david@domain.com"),
                    )
                    MatcherAssert.assertThat<Boolean?>(resultSet.next(), CoreMatchers.equalTo<Boolean?>(false))
                }
            }
        }
    }
}
