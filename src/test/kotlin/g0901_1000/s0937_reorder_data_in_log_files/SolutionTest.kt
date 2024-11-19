package g0901_1000.s0937_reorder_data_in_log_files

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorderLogFiles() {
        assertThat(
            Solution()
                .reorderLogFiles(
                    arrayOf(
                        "dig1 8 1 5 1",
                        "let1 art can",
                        "dig2 3 6",
                        "let2 own kit dig",
                        "let3 art zero",
                    ),
                ),
            equalTo(
                arrayOf(
                    "let1 art can",
                    "let3 art zero",
                    "let2 own kit dig",
                    "dig1 8 1 5 1",
                    "dig2 3 6",
                ),
            ),
        )
    }

    @Test
    fun reorderLogFiles2() {
        assertThat(
            Solution()
                .reorderLogFiles(
                    arrayOf(
                        "a1 9 2 3 1",
                        "g1 act car",
                        "zo4 4 7",
                        "ab1 off key dog",
                        "a8 act zoo",
                    ),
                ),
            equalTo(
                arrayOf(
                    "g1 act car",
                    "a8 act zoo",
                    "ab1 off key dog",
                    "a1 9 2 3 1",
                    "zo4 4 7",
                ),
            ),
        )
    }

    @Test
    fun reorderLogFiles3() {
        assertThat(
            Solution()
                .reorderLogFiles(
                    arrayOf(
                        "a1 9 2 3 1",
                        "g1 act car",
                        "zo4 4 7",
                        "ab1 off key dog",
                        "a8 act zoo",
                        "a2 act car",
                    ),
                ),
            equalTo(
                arrayOf(
                    "a2 act car",
                    "g1 act car",
                    "a8 act zoo",
                    "ab1 off key dog",
                    "a1 9 2 3 1",
                    "zo4 4 7",
                ),
            ),
        )
    }
}
