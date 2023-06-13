package g1501_1600.s1575_count_all_possible_routes

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRoutes() {
        MatcherAssert.assertThat(Solution().countRoutes(intArrayOf(2, 3, 6, 8, 4), 1, 3, 5), CoreMatchers.equalTo(4))
    }

    @Test
    fun countRoutes2() {
        MatcherAssert.assertThat(Solution().countRoutes(intArrayOf(4, 3, 1), 1, 0, 6), CoreMatchers.equalTo(5))
    }

    @Test
    fun countRoutes3() {
        MatcherAssert.assertThat(Solution().countRoutes(intArrayOf(5, 2, 1), 0, 2, 3), CoreMatchers.equalTo(0))
    }
}
