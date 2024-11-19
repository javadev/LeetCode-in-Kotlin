package g2301_2400.s2398_maximum_number_of_robots_within_budget

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumRobots() {
        assertThat(
            Solution()
                .maximumRobots(intArrayOf(3, 6, 1, 3, 4), intArrayOf(2, 1, 3, 4, 5), 25),
            equalTo(3),
        )
    }

    @Test
    fun maximumRobots2() {
        assertThat(
            Solution().maximumRobots(intArrayOf(11, 12, 19), intArrayOf(10, 8, 7), 19),
            equalTo(0),
        )
    }
}
