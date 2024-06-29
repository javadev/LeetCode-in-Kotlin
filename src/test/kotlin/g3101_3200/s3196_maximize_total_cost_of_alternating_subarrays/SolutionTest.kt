package g3101_3200.s3196_maximize_total_cost_of_alternating_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTotalCost() {
        assertThat(Solution().maximumTotalCost(intArrayOf(1, -2, 3, 4)), equalTo(10L))
    }

    @Test
    fun maximumTotalCost2() {
        assertThat(Solution().maximumTotalCost(intArrayOf(1, -1, 1, -1)), equalTo(4L))
    }

    @Test
    fun maximumTotalCost3() {
        assertThat(Solution().maximumTotalCost(intArrayOf(0)), equalTo(0L))
    }

    @Test
    fun maximumTotalCost4() {
        assertThat(Solution().maximumTotalCost(intArrayOf(1, -1)), equalTo(2L))
    }
}
