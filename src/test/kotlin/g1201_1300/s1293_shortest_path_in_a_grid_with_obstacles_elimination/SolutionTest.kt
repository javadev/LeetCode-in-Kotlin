package g1201_1300.s1293_shortest_path_in_a_grid_with_obstacles_elimination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPath() {
        assertThat(
            Solution()
                .shortestPath(
                    arrayOf(
                        intArrayOf(0, 0, 0), intArrayOf(1, 1, 0),
                        intArrayOf(0, 0, 0), intArrayOf(0, 1, 1), intArrayOf(0, 0, 0)
                    ),
                    1
                ),
            equalTo(6)
        )
    }

    @Test
    fun shortestPath2() {
        assertThat(
            Solution().shortestPath(
                arrayOf(
                    intArrayOf(0, 1, 1), intArrayOf(1, 1, 1),
                    intArrayOf(1, 0, 0)
                ),
                1
            ),
            equalTo(-1)
        )
    }
}
