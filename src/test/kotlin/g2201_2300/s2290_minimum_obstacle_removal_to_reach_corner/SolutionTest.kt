package g2201_2300.s2290_minimum_obstacle_removal_to_reach_corner

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumObstacles() {
        assertThat(
            Solution().minimumObstacles(arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            equalTo(2),
        )
    }

    @Test
    fun minimumObstacles2() {
        assertThat(
            Solution()
                .minimumObstacles(
                    arrayOf(
                        intArrayOf(0, 1, 0, 0, 0),
                        intArrayOf(0, 1, 0, 1, 0),
                        intArrayOf(0, 0, 0, 1, 0),
                    ),
                ),
            equalTo(0),
        )
    }

    @Test
    fun minimumObstacles3() {
        assertThat(Solution().minimumObstacles(arrayOf(intArrayOf(1))), equalTo(0))
    }
}
