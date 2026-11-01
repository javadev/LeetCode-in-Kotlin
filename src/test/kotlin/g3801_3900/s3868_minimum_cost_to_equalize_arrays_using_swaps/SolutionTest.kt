package g3801_3900.s3868_minimum_cost_to_equalize_arrays_using_swaps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution().minCost(intArrayOf(10, 20), intArrayOf(20, 10)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(intArrayOf(10, 10), intArrayOf(20, 20)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Int>(
            Solution().minCost(intArrayOf(10, 20), intArrayOf(30, 40)),
            equalTo<Int>(-1),
        )
    }
}
