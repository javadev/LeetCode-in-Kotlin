package g2601_2700.s2662_minimum_cost_of_a_path_with_special_roads

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution().minimumCost(
                intArrayOf(1, 1), intArrayOf(4, 5),
                arrayOf(intArrayOf(1, 2, 3, 3, 2), intArrayOf(3, 4, 4, 5, 1))
            ),
            equalTo(5)
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution().minimumCost(
                intArrayOf(3, 2), intArrayOf(5, 7),
                arrayOf(
                    intArrayOf(3, 2, 3, 4, 4),
                    intArrayOf(3, 3, 5, 5, 5), intArrayOf(3, 4, 5, 6, 6)
                )
            ),
            equalTo(7)
        )
    }
}
