package g0801_0900.s0857_minimum_cost_to_hire_k_workers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.roundToInt

internal class SolutionTest {
    var n = 100000
    @Test
    fun mincostToHireWorkers() {
        assertThat(
            Solution()
                .mincostToHireWorkers(intArrayOf(10, 20, 5), intArrayOf(70, 50, 30), 2),
            equalTo(105.00000)
        )
    }

    @Test
    fun mincostToHireWorkers2() {
        assertThat(
            (
                Solution()
                    .mincostToHireWorkers(
                        intArrayOf(3, 1, 10, 10, 1), intArrayOf(4, 8, 2, 2, 7),
                        3
                    ) *
                    n
                ).roundToInt().toDouble() / n,
            equalTo(30.66667)
        )
    }
}
