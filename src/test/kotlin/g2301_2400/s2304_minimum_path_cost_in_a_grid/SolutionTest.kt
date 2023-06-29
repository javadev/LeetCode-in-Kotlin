package g2301_2400.s2304_minimum_path_cost_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPathCost() {
        assertThat(
            Solution()
                .minPathCost(
                    arrayOf(intArrayOf(5, 3), intArrayOf(4, 0), intArrayOf(2, 1)),
                    arrayOf(
                        intArrayOf(9, 8),
                        intArrayOf(1, 5),
                        intArrayOf(10, 12),
                        intArrayOf(18, 6),
                        intArrayOf(2, 4),
                        intArrayOf(14, 3)
                    )
                ),
            equalTo(17)
        )
    }

    @Test
    fun minPathCost2() {
        assertThat(
            Solution()
                .minPathCost(
                    arrayOf(intArrayOf(5, 1, 2), intArrayOf(4, 0, 3)),
                    arrayOf(
                        intArrayOf(12, 10, 15),
                        intArrayOf(20, 23, 8),
                        intArrayOf(21, 7, 1),
                        intArrayOf(8, 1, 13),
                        intArrayOf(9, 10, 25),
                        intArrayOf(5, 3, 2)
                    )
                ),
            equalTo(6)
        )
    }
}
