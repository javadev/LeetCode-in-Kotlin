package g3501_3600.s3570_find_books_with_no_available_copies

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
            "CREATE TABLE library_books(book_id INTEGER, title VARCHAR(255)" +
                ", author VARCHAR(255), genre VARCHAR(255), publication_year " +
                "INTEGER, total_copies INTEGER); " +
                "INSERT INTO library_books (book_id, title, author, genre, " +
                "publication_year, total_copies) VALUES " +
                "(1, 'The Great Gatsby',      'F. Scott',       'Fiction',   1925, 3)," +
                "(2, 'To Kill a Mockingbird', 'Harper Lee',     'Fiction',   1960, 3)," +
                "(3, '1984',                  'George Orwell',  'Dystopian', 1949, 1)," +
                "(4, 'Pride and Prejudice',   'Jane Austen',    'Romance',   1813, 2)," +
                "(5, 'The Catcher in the Rye','J.D. Salinger',  'Fiction',   1951, 1)," +
                "(6, 'Brave New World',       'Aldous Huxley',  'Dystopian', 1932, 4);" +
                "CREATE TABLE borrowing_records(record_id INTEGER, book_id INTEGER" +
                ", borrower_name VARCHAR(255), borrow_date DATE, return_date DATE); " +
                "INSERT INTO borrowing_records(record_id, book_id, borrower_name, " +
                "borrow_date, return_date) VALUES " +
                "(1, 1, 'Alice Smith',  '2024-01-15', NULL)," +
                "(2, 1, 'Bob Johnson',  '2024-01-20', NULL)," +
                "(3, 2, 'Carol White',  '2024-01-10', '2024-01-25')," +
                "(4, 3, 'David Brown',  '2024-02-01', NULL)," +
                "(5, 4, 'Emma Wilson',  '2024-01-05', NULL)," +
                "(6, 5, 'Frank Davis',  '2024-01-18', '2024-02-10')," +
                "(7, 1, 'Grace Miller', '2024-02-05', NULL)," +
                "(8, 6, 'Henry Taylor', '2024-01-12', NULL)," +
                "(9, 2, 'Ivan Clark',   '2024-02-12', NULL)," +
                "(10,2, 'Jane Adams',   '2024-02-15', NULL);"
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
                                "src/main/kotlin/g3501_3600/" +
                                    "s3570_find_books_with_no_available_copies/" +
                                    "script.sql"
                                ),
                        ),
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*\\r\\n".toRegex(), ""),
                ).use { resultSet ->
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("1"))
                    assertThat<String>(
                        resultSet.getNString(2),
                        equalTo<String>("The Great Gatsby"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("F. Scott"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("Fiction"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("1925"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("3"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(true))
                    assertThat<String>(resultSet.getNString(1), equalTo<String>("3"))
                    assertThat<String>(resultSet.getNString(2), equalTo<String>("1984"))
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("George Orwell"),
                    )
                    assertThat<String>(
                        resultSet.getNString(4),
                        equalTo<String>("Dystopian"),
                    )
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("1949"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("1"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
