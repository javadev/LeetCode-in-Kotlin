package g2801_2900.s2900_longest_unequal_adjacent_groups_subsequence_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordsInLongestSubsequence() {
        assertThat(
            Solution()
                .getWordsInLongestSubsequence(
                    3, arrayOf("e", "a", "b"), intArrayOf(0, 0, 1)
                ),
            equalTo(mutableListOf("e", "b"))
        )
    }

    @Test
    fun wordsInLongestSubsequence2() {
        assertThat(
            Solution()
                .getWordsInLongestSubsequence(
                    4, arrayOf("a", "b", "c", "d"), intArrayOf(1, 0, 1, 1)
                ),
            equalTo(mutableListOf("a", "b", "c"))
        )
    }
}
