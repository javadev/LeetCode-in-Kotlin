package g3801_3900.s3801_minimum_cost_to_merge_sorted_lists

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMergeCost() {
        assertThat<Long>(
            Solution().minMergeCost(arrayOf<IntArray>(intArrayOf(1, 3, 5), intArrayOf(2, 4), intArrayOf(6, 7, 8))),
            equalTo<Long>(18L),
        )
    }

    @Test
    fun minMergeCost2() {
        assertThat<Long>(
            Solution().minMergeCost(arrayOf<IntArray>(intArrayOf(1, 1, 5), intArrayOf(1, 4, 7, 8))),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun minMergeCost3() {
        assertThat<Long>(
            Solution().minMergeCost(arrayOf<IntArray>(intArrayOf(1), intArrayOf(3))),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minMergeCost4() {
        assertThat<Long>(
            Solution().minMergeCost(arrayOf<IntArray>(intArrayOf(1), intArrayOf(1))),
            equalTo<Long>(2L),
        )
    }
}
