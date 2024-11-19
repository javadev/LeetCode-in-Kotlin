package g1201_1300.s1266_minimum_time_visiting_all_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTimeToVisitAllPoints() {
        assertThat(
            Solution().minTimeToVisitAllPoints(arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))),
            equalTo(7),
        )
    }

    @Test
    fun minTimeToVisitAllPoints2() {
        assertThat(
            Solution().minTimeToVisitAllPoints(arrayOf(intArrayOf(3, 2), intArrayOf(-2, 2))),
            equalTo(5),
        )
    }
}
