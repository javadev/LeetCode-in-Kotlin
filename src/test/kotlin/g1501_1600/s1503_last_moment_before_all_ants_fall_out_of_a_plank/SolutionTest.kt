package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val lastMoment: Unit
        get() {
            assertThat(
                Solution().getLastMoment(4, intArrayOf(4, 3), intArrayOf(0, 1)),
                equalTo(4)
            )
        }

    @get:Test
    val lastMoment2: Unit
        get() {
            assertThat(
                Solution().getLastMoment(7, intArrayOf(), intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)),
                equalTo(7)
            )
        }

    @get:Test
    val lastMoment3: Unit
        get() {
            assertThat(
                Solution().getLastMoment(7, intArrayOf(0, 1, 2, 3, 4, 5, 6, 7), intArrayOf()),
                equalTo(7)
            )
        }
}
