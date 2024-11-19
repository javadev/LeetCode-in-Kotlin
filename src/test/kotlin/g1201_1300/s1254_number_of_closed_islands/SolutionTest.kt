package g1201_1300.s1254_number_of_closed_islands

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closedIsland() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0, 1, 1, 0),
            intArrayOf(1, 0, 1, 0, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0, 1, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 0),
        )
        assertThat(Solution().closedIsland(grid), equalTo(2))
    }

    @Test
    fun closedIsland2() {
        val grid = arrayOf(intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 1, 1, 1, 0))
        assertThat(Solution().closedIsland(grid), equalTo(1))
    }

    @Test
    fun closedIsland3() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1),
            intArrayOf(1, 0, 0, 0, 0, 0, 1),
            intArrayOf(1, 0, 1, 1, 1, 0, 1),
            intArrayOf(1, 0, 1, 0, 1, 0, 1),
            intArrayOf(1, 0, 1, 1, 1, 0, 1),
            intArrayOf(1, 0, 0, 0, 0, 0, 1),
            intArrayOf(1, 1, 1, 1, 1, 1, 1),
        )
        assertThat(Solution().closedIsland(grid), equalTo(2))
    }
}
