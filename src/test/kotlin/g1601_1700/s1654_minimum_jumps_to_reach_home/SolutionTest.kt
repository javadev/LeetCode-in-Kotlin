package g1601_1700.s1654_minimum_jumps_to_reach_home

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumJumps() {
        assertThat(Solution().minimumJumps(intArrayOf(14, 4, 18, 1, 15), 3, 15, 9), equalTo(3))
    }

    @Test
    fun minimumJumps2() {
        assertThat(
            Solution().minimumJumps(intArrayOf(8, 3, 16, 6, 12, 20), 15, 13, 11),
            equalTo(-1)
        )
    }

    @Test
    fun minimumJumps3() {
        assertThat(
            Solution().minimumJumps(intArrayOf(1, 6, 2, 14, 5, 17, 4), 16, 9, 7),
            equalTo(2)
        )
    }
}
