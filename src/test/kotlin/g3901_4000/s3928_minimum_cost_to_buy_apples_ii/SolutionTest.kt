package g3901_4000.s3928_minimum_cost_to_buy_apples_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<IntArray>(
            Solution().minCost(2, intArrayOf(8, 3), arrayOf<IntArray>(intArrayOf(0, 1, 1, 2))),
            equalTo<IntArray>(intArrayOf(6, 3)),
        )
    }

    @Test
    fun minCost2() {
        assertThat<IntArray>(
            Solution()
                .minCost(3, intArrayOf(9, 4, 6), arrayOf<IntArray>(intArrayOf(0, 1, 1, 3), intArrayOf(1, 2, 4, 2))),
            equalTo<IntArray>(intArrayOf(8, 4, 6)),
        )
    }

    @Test
    fun minCost3() {
        assertThat<IntArray>(
            Solution()
                .minCost(
                    3,
                    intArrayOf(10, 11, 1),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1, 3), intArrayOf(1, 2, 3, 4), intArrayOf(0, 1, 5, 2)),
                ),
            equalTo<IntArray>(intArrayOf(5, 11, 1)),
        )
    }

    @Test
    fun minCost4() {
        assertThat<IntArray>(
            Solution().minCost(2, intArrayOf(4, 2), arrayOf<IntArray>()),
            equalTo<IntArray>(intArrayOf(4, 2)),
        )
    }

    @Test
    fun minCost5() {
        assertThat<IntArray>(
            Solution()
                .minCost(
                    3,
                    intArrayOf(100, 100, 1),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1, 100), intArrayOf(0, 1, 2, 1), intArrayOf(1, 2, 2, 1)),
                ),
            equalTo<IntArray>(intArrayOf(6, 5, 1)),
        )
    }

    @Test
    fun minCost6() {
        assertThat<IntArray>(
            Solution()
                .minCost(
                    2,
                    intArrayOf(1000000000, 1),
                    arrayOf<IntArray>(intArrayOf(0, 1, 1000000000, 100)),
                ),
            equalTo<IntArray>(intArrayOf(1000000000, 1)),
        )
    }

    @Test
    fun minCost7() {
        assertThat<IntArray>(
            Solution().minCost(1, intArrayOf(7), arrayOf<IntArray>()),
            equalTo<IntArray>(intArrayOf(7)),
        )
    }
}
