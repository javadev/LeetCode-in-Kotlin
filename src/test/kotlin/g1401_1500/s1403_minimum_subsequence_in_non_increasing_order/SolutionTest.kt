package g1401_1500.s1403_minimum_subsequence_in_non_increasing_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSubsequence() {
        assertThat(
            Solution().minSubsequence(intArrayOf(4, 3, 10, 9, 8)),
            equalTo(mutableListOf(10, 9))
        )
    }

    @Test
    fun minSubsequence2() {
        assertThat(
            Solution().minSubsequence(intArrayOf(4, 4, 7, 6, 7)),
            equalTo(mutableListOf(7, 7, 6))
        )
    }

    @Test
    fun minSubsequence3() {
        assertThat(
            Solution().minSubsequence(intArrayOf(6)),
            equalTo(listOf(6))
        )
    }
}
