package g3001_3100.s3010_divide_an_array_into_subarrays_with_minimum_cost_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(Solution().minimumCost(intArrayOf(1, 2, 3, 12)), equalTo(6))
    }

    @Test
    fun minimumCost2() {
        assertThat(Solution().minimumCost(intArrayOf(5, 4, 3)), equalTo(12))
    }

    @Test
    fun minimumCost3() {
        assertThat(Solution().minimumCost(intArrayOf(10, 3, 1, 1)), equalTo(12))
    }
}
