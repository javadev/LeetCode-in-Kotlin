package g2401_2500.s2462_total_cost_to_hire_k_workers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalCost() {
        assertThat(
            Solution().totalCost(intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8), 3, 4),
            equalTo(11L)
        )
    }

    @Test
    fun totalCost2() {
        assertThat(Solution().totalCost(intArrayOf(1, 2, 4, 1), 3, 3), equalTo(4L))
    }
}
