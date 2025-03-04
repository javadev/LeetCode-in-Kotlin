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
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("ATGCTAGCTAGCTAA"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Human"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("FALSE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("2"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("GGGTCAATCATC"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Human"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("TRUE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("3"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("ATATATCGTAGCTA"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Human"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("FALSE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("4"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("ATGGGGTCATCATAA"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Human"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("TRUE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("5"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("TCAGTCAGTCAG"),
                    )
                    assertThat<String>(resultSet.getNString(3), equalTo<String>("Human"))
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("FALSE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("6"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("ATATCGCGCTAG"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Zebrafish"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("TRUE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("FALSE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("7"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("CGTATGCGTCGTA"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("Zebrafish"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("FALSE"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("FALSE"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
