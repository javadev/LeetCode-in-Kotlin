package g1201_1300.s1255_maximum_score_words_formed_by_letters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScoreWords() {
        assertThat(
            Solution()
                .maxScoreWords(
                    arrayOf("dog", "cat", "dad", "good"),
                    charArrayOf('a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'),
                    intArrayOf(
                        1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0,
                    ),
                ),
            equalTo(23),
        )
    }

    @Test
    fun maxScoreWords2() {
        assertThat(
            Solution()
                .maxScoreWords(
                    arrayOf("xxxz", "ax", "bx", "cx"),
                    charArrayOf('z', 'a', 'b', 'c', 'x', 'x', 'x'),
                    intArrayOf(
                        4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 5, 0, 10,
                    ),
                ),
            equalTo(27),
        )
    }

    @Test
    fun maxScoreWords3() {
        assertThat(
            Solution()
                .maxScoreWords(
                    arrayOf("leetcode"),
                    charArrayOf('l', 'e', 't', 'c', 'o', 'd'),
                    intArrayOf(
                        0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0,
                        0, 0, 0, 0, 0,
                    ),
                ),
            equalTo(0),
        )
    }
}
