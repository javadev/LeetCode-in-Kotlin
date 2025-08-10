package g3601_3700.s3642_find_books_with_polarized_opinions

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
            "CREATE TABLE books (" +
                "    book_id INT PRIMARY KEY," +
                "    title VARCHAR(255)," +
                "    author VARCHAR(255)," +
                "    genre VARCHAR(50)," +
                "    pages INT" +
                ");" +
                "INSERT INTO books (book_id, title, author, genre, pages) VALUES" +
                "(1, 'The Great Gatsby', 'F. Scott', 'Fiction', 180)," +
                "(2, 'To Kill a Mockingbird', 'Harper Lee', 'Fiction', 281)," +
                "(3, '1984', 'George Orwell', 'Dystopian', 328)," +
                "(4, 'Pride and Prejudice', 'Jane Austen', 'Romance', 432)," +
                "(5, 'The Catcher in the Rye', 'J.D. Salinger', 'Fiction', 277);" +
                "CREATE TABLE reading_sessions (" +
                "    session_id INT PRIMARY KEY," +
                "    book_id INT," +
                "    reader_name VARCHAR(100)," +
                "    pages_read INT," +
                "    session_rating INT," +
                "    FOREIGN KEY (book_id) REFERENCES books(book_id)" +
                ");" +
                "INSERT INTO reading_sessions (session_id, book_id, " +
                "reader_name, pages_read, session_rating) VALUES" +
                "(1, 1, 'Alice', 50, 5)," +
                "(2, 1, 'Bob', 60, 1)," +
                "(3, 1, 'Carol', 40, 4)," +
                "(4, 1, 'David', 30, 2)," +
                "(5, 1, 'Emma', 45, 5)," +
                "(6, 2, 'Frank', 80, 4)," +
                "(7, 2, 'Grace', 70, 4)," +
                "(8, 2, 'Henry', 90, 5)," +
                "(9, 2, 'Ivy', 60, 4)," +
                "(10, 2, 'Jack', 75, 4)," +
                "(11, 3, 'Kate', 100, 2)," +
                "(12, 3, 'Liam', 120, 1)," +
                "(13, 3, 'Mia', 80, 2)," +
                "(14, 3, 'Noah', 90, 1)," +
                "(15, 3, 'Olivia', 110, 4)," +
                "(16, 3, 'Paul', 95, 5)," +
                "(17, 4, 'Quinn', 150, 3)," +
                "(18, 4, 'Ruby', 140, 3)," +
                "(19, 5, 'Sam', 80, 1)," +
                "(20, 5, 'Tara', 70, 2);"
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
                                    "s3642_find_books_with_" +
                                    "polarized_opinions/" +
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
                        equalTo<String>("The Great Gatsby"),
                    )
                    assertThat<String>(
                        resultSet.getNString(3),
                        equalTo<String>("F. Scott"),
                    )
                    assertThat<String>(resultSet.getNString(4), equalTo<String>("Fiction"))
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("180"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("4"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("1.00"))
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
                    assertThat<String>(resultSet.getNString(5), equalTo<String>("328"))
                    assertThat<String>(resultSet.getNString(6), equalTo<String>("4"))
                    assertThat<String>(resultSet.getNString(7), equalTo<String>("1.00"))
                    assertThat<Boolean>(resultSet.next(), equalTo<Boolean>(false))
                }
            }
        }
    }
}
