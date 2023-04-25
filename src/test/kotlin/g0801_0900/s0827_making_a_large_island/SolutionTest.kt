package g0801_0900.s0827_making_a_large_island

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestIsland() {
        assertThat(Solution().largestIsland(arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))), equalTo(3))
    }

    @Test
    fun largestIsland2() {
        assertThat(Solution().largestIsland(arrayOf(intArrayOf(1, 1), intArrayOf(1, 0))), equalTo(4))
    }

    @Test
    fun largestIsland3() {
        assertThat(Solution().largestIsland(arrayOf(intArrayOf(1, 1), intArrayOf(1, 0))), equalTo(4))
    }
}
