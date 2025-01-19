package g3401_3500.s3424_minimum_cost_to_make_arrays_identical

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(
            Solution().minCost(intArrayOf(-7, 9, 5), intArrayOf(7, -2, -5), 2),
            equalTo<Long>(13L),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Long>(
            Solution().minCost(intArrayOf(2, 1), intArrayOf(2, 1), 0),
            equalTo<Long>(0L),
        )
    }
}
