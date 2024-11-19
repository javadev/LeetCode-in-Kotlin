package g0601_0700.s0607_sales_person

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
        "CREATE TABLE SalesPerson(sales_id INTEGER PRIMARY KEY, name VARCHAR," +
            " salary INTEGER, commission_rate INTEGER, hire_date DATE); " +
            "INSERT INTO SalesPerson(sales_id, name, salary, commission_rate, hire_date)" +
            " VALUES (1, 'John', 100000, 6, '2006-04-01'); " +
            "INSERT INTO SalesPerson(sales_id, name, salary, commission_rate, hire_date)" +
            " VALUES (2, 'Amy', 12000, 5, '2006-05-01'); " +
            "INSERT INTO SalesPerson(sales_id, name, salary, commission_rate, hire_date)" +
            " VALUES (3, 'Mark', 65000, 12, '2006-12-25'); " +
            "INSERT INTO SalesPerson(sales_id, name, salary, commission_rate, hire_date)" +
            " VALUES (4, 'Pam', 25000, 25, '2006-01-01'); " +
            "INSERT INTO SalesPerson(sales_id, name, salary, commission_rate, hire_date)" +
            " VALUES (5, 'Alex', 5000, 10, '2006-02-03'); " +
            "CREATE TABLE Company(com_id INTEGER PRIMARY KEY, name VARCHAR, city VARCHAR); " +
            "INSERT INTO Company(com_id, name, city) VALUES (1, 'RED', 'Boston'); " +
            "INSERT INTO Company(com_id, name, city) VALUES (2, 'ORANGE', 'New York'); " +
            "INSERT INTO Company(com_id, name, city) VALUES (3, 'YELLOW', 'Boston'); " +
            "INSERT INTO Company(com_id, name, city) VALUES (4, 'GREEN', 'Austin'); " +
            "CREATE TABLE Orders(order_id INTEGER PRIMARY KEY, order_date DATE," +
            " com_id INTEGER, sales_id INTEGER, amount INTEGER); " +
            "INSERT INTO Orders(order_id, order_date, com_id, sales_id, amount)" +
            " VALUES (1, '2014-01-01', 3, 4, 10000); " +
            "INSERT INTO Orders(order_id, order_date, com_id, sales_id, amount)" +
            " VALUES (2, '2014-01-02', 4, 5, 5000); " +
            "INSERT INTO Orders(order_id, order_date, com_id, sales_id, amount)" +
            " VALUES (3, '2014-01-03', 1, 1, 50000); " +
            "INSERT INTO Orders(order_id, order_date, com_id, sales_id, amount)" +
            " VALUES (4, '2014-01-04', 1, 4, 25000); ",
    ],
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
                            "src/main/kotlin/g0601_0700/" +
                                "s0607_sales_person" +
                                "/script.sql",
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Amy"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Mark"))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getNString(1), equalTo("Alex"))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
