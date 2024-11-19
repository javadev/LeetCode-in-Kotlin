package g2001_2100.s2099_find_subsequence_of_length_k_with_the_largest_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubsequence() {
        assertThat(
            Solution().maxSubsequence(intArrayOf(2, 1, 3, 3), 2),
            equalTo(intArrayOf(3, 3)),
        )
    }

    @Test
    fun maxSubsequence2() {
        assertThat(
            Solution().maxSubsequence(intArrayOf(-1, -2, 3, 4), 3),
            equalTo(intArrayOf(-1, 3, 4)),
        )
    }

    @Test
    fun maxSubsequence3() {
        assertThat(
            Solution().maxSubsequence(intArrayOf(3, 4, 3, 3), 2),
            equalTo(intArrayOf(4, 3)),
        )
    }
}
