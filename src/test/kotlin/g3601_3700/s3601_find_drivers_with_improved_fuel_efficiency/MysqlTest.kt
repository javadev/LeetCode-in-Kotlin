package g3601_3700.s3601_find_drivers_with_improved_fuel_efficiency

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
            "CREATE TABLE drivers (driver_id INTEGER, driver_name VARCHAR(255)); " +
                "INSERT INTO drivers (driver_id, driver_name) VALUES" +
                "(1, 'Alice Johnson')," +
                "(2, 'Bob Smith')," +
                "(3, 'Carol Davis')," +
                "(4, 'David Wilson')," +
                "(5, 'Emma Brown');" +
                "CREATE TABLE trips (trip_id INTEGER, driver_id INTEGER" +
                ", trip_date DATE, distance_km DECIMAL(7, 3), fuel_consumed DECIMAL(7, 3)); " +
                "INSERT INTO trips (trip_id, driver_id, trip_date, distance_km, fuel_consumed) VALUES" +
                "(1, 1, '2023-02-15', 120.5, 10.2)," +
                "(2, 1, '2023-03-20', 200.0, 16.5)," +
                "(3, 1, '2023-08-10', 150.0, 11.0)," +
                "(4, 1, '2023-09-25', 180.0, 12.5)," +
                "(5, 2, '2023-01-10', 100.0, 9.0)," +
                "(6, 2, '2023-04-15', 250.0, 22.0)," +
                "(7, 2, '2023-10-05', 200.0, 15.0)," +
                "(8, 3, '2023-03-12', 80.0, 8.5)," +
                "(9, 3, '2023-05-18', 90.0, 9.2)," +
                "(10, 4, '2023-07-22', 160.0, 12.8)," +
                "(11, 4, '2023-11-30', 140.0, 11.0)," +
                "(12, 5, '2023-02-28', 110.0, 11.5);"
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
                                    "s3601_find_drivers_with_" +
                                    "improved_fuel_efficiency/" +
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
                        equalTo<String>("Bob Smith"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("11.24"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("13.33"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("Alice Johnson"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("11.97"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("14.02"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
