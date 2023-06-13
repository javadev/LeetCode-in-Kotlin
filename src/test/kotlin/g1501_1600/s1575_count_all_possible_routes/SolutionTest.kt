package g1501_1600.s1575_count_all_possible_routes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRoutes() {
        assertThat(Solution().countRoutes(intArrayOf(2, 3, 6, 8, 4), 1, 3, 5), equalTo(4))
    }

    @Test
    fun countRoutes2() {
        assertThat(Solution().countRoutes(intArrayOf(4, 3, 1), 1, 0, 6), equalTo(5))
    }

    @Test
    fun countRoutes3() {
        assertThat(Solution().countRoutes(intArrayOf(5, 2, 1), 0, 2, 3), equalTo(0))
    }
}
