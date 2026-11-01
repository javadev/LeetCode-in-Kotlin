package g3801_3900.s3857_minimum_cost_to_split_into_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(Solution().minCost(1), equalTo<Int>(0))
    }

    @Test
    fun minCost2() {
        assertThat<Int>(Solution().minCost(3), equalTo<Int>(3))
    }

    @Test
    fun minCost3() {
        assertThat<Int>(Solution().minCost(4), equalTo<Int>(6))
    }
}
