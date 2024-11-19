package g0301_0400.s0373_find_k_pairs_with_smallest_sums

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kSmallestPairs() {
        assertThat(
            Solution().kSmallestPairs(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(1, 2), intArrayOf(1, 4), intArrayOf(1, 6)))),
        )
    }

    @Test
    fun kSmallestPairs2() {
        assertThat(
            Solution().kSmallestPairs(intArrayOf(1, 1, 2), intArrayOf(1, 2, 3), 2),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1)))),
        )
    }

    @Test
    fun kSmallestPairs3() {
        assertThat(
            Solution().kSmallestPairs(intArrayOf(1, 2), intArrayOf(3), 3),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)))),
        )
    }
}
