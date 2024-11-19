package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastMoment() {
        assertThat(
            Solution().getLastMoment(4, intArrayOf(4, 3), intArrayOf(0, 1)),
            equalTo(4),
        )
    }

    @Test
    fun lastMoment2() {
        assertThat(
            Solution().getLastMoment(7, intArrayOf(), intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)),
            equalTo(7),
        )
    }

    @Test
    fun lastMoment3() {
        assertThat(
            Solution().getLastMoment(7, intArrayOf(0, 1, 2, 3, 4, 5, 6, 7), intArrayOf()),
            equalTo(7),
        )
    }
}
