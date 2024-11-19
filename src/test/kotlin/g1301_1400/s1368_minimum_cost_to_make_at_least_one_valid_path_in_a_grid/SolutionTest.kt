package g1301_1400.s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution()
                .minCost(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(2, 2, 2, 2),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(2, 2, 2, 2),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution().minCost(
                arrayOf(
                    intArrayOf(1, 1, 3),
                    intArrayOf(3, 2, 2),
                    intArrayOf(1, 1, 4),
                ),
            ),
            equalTo(0),
        )
    }

    @Test
    fun minCost3() {
        assertThat(
            Solution().minCost(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(4, 3),
                ),
            ),
            equalTo(1),
        )
    }
}
