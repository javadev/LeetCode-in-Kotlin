package g3001_3100.s3013_divide_an_array_into_subarrays_with_minimum_cost_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(Solution().minimumCost(intArrayOf(1, 3, 2, 6, 4, 2), 3, 3), equalTo(5L))
    }

    @Test
    fun minimumCost2() {
        assertThat(Solution().minimumCost(intArrayOf(10, 1, 2, 2, 2, 1), 4, 3), equalTo(15L))
    }

    @Test
    fun minimumCost3() {
        assertThat(Solution().minimumCost(intArrayOf(10, 8, 18, 9), 3, 1), equalTo(36L))
    }
}
