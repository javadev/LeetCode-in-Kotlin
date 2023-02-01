package g0001_0100.s0040_combination_sum_ii

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun combinationSum2() {
        val expected = arrayOf(intArrayOf(1, 1, 6), intArrayOf(1, 2, 5), intArrayOf(1, 7), intArrayOf(2, 6))
        assertThat(
            Solution().combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8),
            equalTo(getLists(expected))
        )
    }

    @Test
    fun combinationSum22() {
        val expected = arrayOf(intArrayOf(1, 2, 2), intArrayOf(5))
        assertThat(
            Solution().combinationSum2(intArrayOf(2, 5, 2, 1, 2), 5),
            equalTo(getLists(expected))
        )
    }
}
