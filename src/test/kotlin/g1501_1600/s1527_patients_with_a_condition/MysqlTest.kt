package g1501_1600.s1527_patients_with_a_condition

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
    initialSqls = ["CREATE TABLE Patients(patient_id INTEGER PRIMARY KEY, patient_name"
            + " VARCHAR, conditions VARCHAR); "
            + "INSERT INTO Patients(patient_id, patient_name, conditions)"
            + " VALUES (1, 'Daniel', 'YFEV COUGH'); "
            + "INSERT INTO Patients(patient_id, patient_name, conditions)"
            + " VALUES (2, 'Alice', ''); "
            + "INSERT INTO Patients(patient_id, patient_name, conditions)"
            + " VALUES (3, 'Bob', 'DIAB100 MYOP'); "
            + "INSERT INTO Patients(patient_id, patient_name, conditions)"
            + " VALUES (4, 'George', 'ACNE DIAB100'); "
            + "INSERT INTO Patients(patient_id, patient_name, conditions)"
            + " VALUES (5, 'Alain', 'DIAB201'); "]
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
                            "src/main/java/g1501_1600/s1527_patien"
                                    + "ts_with_a_condition/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(3))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("Bob"))
                    MatcherAssert.assertThat(resultSet.getNString(3), CoreMatchers.equalTo("DIAB100 MYOP"))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(true))
                    MatcherAssert.assertThat(resultSet.getInt(1), CoreMatchers.equalTo(4))
                    MatcherAssert.assertThat(resultSet.getNString(2), CoreMatchers.equalTo("George"))
                    MatcherAssert.assertThat(resultSet.getNString(3), CoreMatchers.equalTo("ACNE DIAB100"))
                    MatcherAssert.assertThat(resultSet.next(), CoreMatchers.equalTo(false))
                }
            }
        }
    }
}
