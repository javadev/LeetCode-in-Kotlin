package g2901_3000.s2901_longest_unequal_adjacent_groups_subsequence_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordsInLongestSubsequence() {
        assertThat(
            Solution()
                .getWordsInLongestSubsequence(
                    3,
                    arrayOf("bab", "dab", "cab"),
                    intArrayOf(1, 2, 2),
                ),
            equalTo(mutableListOf("bab", "dab")),
        )
    }

    @Test
    fun wordsInLongestSubsequence2() {
        assertThat(
            Solution()
                .getWordsInLongestSubsequence(
                    4,
                    arrayOf("a", "b", "c", "d"),
                    intArrayOf(1, 2, 3, 4),
                ),
            equalTo(mutableListOf("a", "b", "c", "d")),
        )
    }
}
