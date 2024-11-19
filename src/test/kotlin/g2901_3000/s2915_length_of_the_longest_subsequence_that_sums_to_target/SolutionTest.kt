package g2901_3000.s2915_length_of_the_longest_subsequence_that_sums_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfLongestSubsequence() {
        assertThat(
            Solution().lengthOfLongestSubsequence(mutableListOf(1, 2, 3, 4, 5), 9),
            equalTo(3),
        )
    }

    @Test
    fun lengthOfLongestSubsequence2() {
        assertThat(
            Solution().lengthOfLongestSubsequence(mutableListOf(4, 1, 3, 2, 1, 5), 7),
            equalTo(4),
        )
    }

    @Test
    fun lengthOfLongestSubsequence3() {
        assertThat(
            Solution().lengthOfLongestSubsequence(mutableListOf(1, 1, 5, 4, 5), 3),
            equalTo(-1),
        )
    }
}
