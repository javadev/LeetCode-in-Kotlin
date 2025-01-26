package g3401_3500.s3435_frequencies_of_shortest_supersequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun supersequences() {
        assertThat(
            Solution().supersequences(arrayOf("ab", "ba")),
            equalTo(
                listOf(
                    listOf(
                        2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0,
                    ),
                    listOf(
                        1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0,
                    ),
                ),
            ),
        )
    }

    @Test
    fun supersequences2() {
        assertThat(
            Solution().supersequences(arrayOf("aa", "ac")),
            equalTo(
                listOf(
                    listOf(
                        2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0,
                    ),
                ),
            ),
        )
    }

    @Test
    fun supersequences3() {
        assertThat(
            Solution().supersequences(arrayOf("aa", "bb", "cc")),
            equalTo(
                listOf(
                    listOf(
                        2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0,
                    ),
                ),
            ),
        )
    }
}
