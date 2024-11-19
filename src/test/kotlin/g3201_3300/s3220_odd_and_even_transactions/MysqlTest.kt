package g3201_3300.s3220_odd_and_even_transactions

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
            "CREATE TABLE transactions(transaction_id INTEGER PRIMARY KEY, amount INTEGER" +
                ", transaction_date DATE); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (1, 150, '2024-07-01'); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (2, 200, '2024-07-01'); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (3, 75, '2024-07-01'); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (4, 300, '2024-07-02'); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (5, 50, '2024-07-02'); " +
                "INSERT INTO transactions(transaction_id, amount, transaction_date)" +
                " VALUES (6, 120, '2024-07-03'); "
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
                            "src/main/kotlin/g3201_3300/" +
                                "s3220_odd_and_even_transactions/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(
                        resultSet.getNString(1),
                        equalTo<String>("2024-07-01"),
                    )
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("75"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("350"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(
                        resultSet.getNString(1),
                        equalTo<String>("2024-07-02"),
                    )
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("0"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("350"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(
                        resultSet.getNString(1),
                        equalTo<String>("2024-07-03"),
                    )
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("0"))
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("120"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
