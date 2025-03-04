package g3401_3500.s3475_dna_pattern_recognition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.ResultSet
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        (
            "    CREATE TABLE Samples (" +
                "    sample_id INT," +
                "    dna_sequence VARCHAR(100)," +
                "    species VARCHAR(100)" +
                ");" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(1, 'ATGCTAGCTAGCTAA', 'Human');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(2, 'GGGTCAATCATC', 'Human');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(3, 'ATATATCGTAGCTA', 'Human');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(4, 'ATGGGGTCATCATAA', 'Human');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(5, 'TCAGTCAGTCAG', 'Human');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(6, 'ATATCGCGCTAG', 'Zebrafish');" +
                "insert into Samples (sample_id, dna_sequence, species) values " +
                "(7, 'CGTATGCGTCGTA', 'Zebrafish');"
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
                                "src/main/kotlin/g3401_3500/" +
                                    "s3475_dna_pattern_recognition/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 1, "ATGCTAGCTAGCTAA", "Human", "TRUE", "TRUE", "FALSE", "FALSE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 2, "GGGTCAATCATC", "Human", "FALSE", "FALSE", "FALSE", "TRUE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 3, "ATATATCGTAGCTA", "Human", "FALSE", "FALSE", "TRUE", "FALSE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 4, "ATGGGGTCATCATAA", "Human", "TRUE", "TRUE", "FALSE", "TRUE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 5, "TCAGTCAGTCAG", "Human", "FALSE", "FALSE", "FALSE", "FALSE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 6, "ATATCGCGCTAG", "Zebrafish", "FALSE", "TRUE", "TRUE", "FALSE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    checkRow(resultSet, 7, "CGTATGCGTCGTA", "Zebrafish", "FALSE", "FALSE", "FALSE", "FALSE")
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }

    private fun checkRow(
        resultSet: ResultSet,
        sampleId: Int,
        dnaSequence: String,
        species: String,
        hasStart: String,
        hasStop: String,
        hasAtat: String,
        hasGgg: String,
    ) {
        assertThat<Int>(resultSet.getInt(1), equalTo<Int>(sampleId))
        assertThat<String>(resultSet.getNString(2), equalTo<String>(dnaSequence))
        assertThat<String>(resultSet.getNString(3), equalTo<String>(species))
        assertThat<String>(resultSet.getNString(4), equalTo<String>(hasStart))
        assertThat<String>(resultSet.getNString(5), equalTo<String>(hasStop))
        assertThat<String>(resultSet.getNString(6), equalTo<String>(hasAtat))
        assertThat<String>(resultSet.getNString(7), equalTo<String>(hasGgg))
    }
}
