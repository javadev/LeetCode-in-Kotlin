package g3101_3200.s3139_minimum_cost_to_equalize_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostToEqualizeArray() {
        assertThat(Solution().minCostToEqualizeArray(intArrayOf(4, 1), 5, 2), equalTo(15))
    }

    @Test
    fun minCostToEqualizeArray2() {
        assertThat(
            Solution().minCostToEqualizeArray(intArrayOf(2, 3, 3, 3, 5), 2, 1), equalTo(6)
        )
    }

    @Test
    fun minCostToEqualizeArray3() {
        assertThat(Solution().minCostToEqualizeArray(intArrayOf(3, 5, 3), 1, 3), equalTo(4))
    }
}
