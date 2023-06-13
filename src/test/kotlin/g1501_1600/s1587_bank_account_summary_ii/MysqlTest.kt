package g1501_1600.s1587_bank_account_summary_ii

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
        "CREATE TABLE Users(account INTEGER PRIMARY KEY, name VARCHAR); " +
            "INSERT INTO Users(account, name) VALUES (900001, 'Alice'); " +
            "INSERT INTO Users(account, name) VALUES (900002, 'Bob'); " +
            "INSERT INTO Users(account, name) VALUES (900003, 'Charlie'); " +
            "CREATE TABLE Transactions(trans_id INTEGER PRIMARY KEY," +
            " account INTEGER, amount INTEGER, transacted_on DATE); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (1, 900001, 7000, '2020-08-01'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (2, 900001, 7000, '2020-09-01'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (3, 900001, -3000, '2020-09-02'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (4, 900002, 1000, '2020-09-12'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (5, 900003, 6000, '2020-08-07'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (6, 900003, 6000, '2020-09-07'); " +
            "INSERT INTO Transactions(trans_id, account, amount, transacted_on)" +
            " VALUES (7, 900003, -4000, '2020-09-11'); "
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
                            "src/main/kotlin/g1501_1600/s1587_bank_" +
                                "account_summary_ii/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getNString(1), CoreMatchers.equalTo("Alice"))
                    MatcherAssert.assertThat(resultSet.getInt(2), CoreMatchers.equalTo(11000))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(false))
                }
            }
        }
    }
}
