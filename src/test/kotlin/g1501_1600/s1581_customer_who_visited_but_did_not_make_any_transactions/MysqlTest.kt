package g1501_1600.s1581_customer_who_visited_but_did_not_make_any_transactions

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
        "CREATE TABLE Visits(visit_id INTEGER PRIMARY KEY, customer_id INTEGER); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (1, 23); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (2, 9); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (4, 30); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (5, 54); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (6, 96); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (7, 54); " +
            "INSERT INTO Visits(visit_id, customer_id) VALUES (8, 54); " +
            "CREATE TABLE Transactions(transaction_id INTEGER PRIMARY KEY," +
            " visit_id INTEGER, amount INTEGER); " +
            "INSERT INTO Transactions(transaction_id, visit_id, amount)" +
            " VALUES (2, 5, 310); " +
            "INSERT INTO Transactions(transaction_id, visit_id, amount)" +
            " VALUES (3, 5, 300); " +
            "INSERT INTO Transactions(transaction_id, visit_id, amount)" +
            " VALUES (9, 5, 200); " +
            "INSERT INTO Transactions(transaction_id, visit_id, amount)" +
            " VALUES (12, 1, 910); " +
            "INSERT INTO Transactions(transaction_id, visit_id, amount)" +
            " VALUES (13, 2, 970); ",
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
                            "src/main/kotlin/g1501_1600/s1581_customer_who_visi" +
                                "ted_but_did_not_make_any_transactions/scr" +
                                "ipt.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(30))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(54))
                    assertThat(resultSet.getInt(2), equalTo(2))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(96))
                    assertThat(resultSet.getInt(2), equalTo(1))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
