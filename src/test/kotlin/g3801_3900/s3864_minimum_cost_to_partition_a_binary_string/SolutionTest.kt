package g3801_3900.s3864_minimum_cost_to_partition_a_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(Solution().minCost("1010", 2, 1), equalTo<Long>(6L))
    }

    @Test
    fun minCost2() {
        assertThat<Long>(Solution().minCost("1010", 3, 10), equalTo<Long>(12L))
    }

    @Test
    fun minCost3() {
        assertThat<Long>(Solution().minCost("00", 1, 2), equalTo<Long>(2L))
    }
}
