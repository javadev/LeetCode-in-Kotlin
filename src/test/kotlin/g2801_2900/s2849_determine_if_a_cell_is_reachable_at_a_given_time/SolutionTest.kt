package g2801_2900.s2849_determine_if_a_cell_is_reachable_at_a_given_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isReachableAtTime: Unit
        get() {
            assertThat(Solution().isReachableAtTime(2, 4, 7, 7, 6), equalTo(true))
        }

    @get:Test
    val isReachableAtTime2: Unit
        get() {
            assertThat(Solution().isReachableAtTime(3, 1, 7, 3, 3), equalTo(false))
        }

    @get:Test
    val isReachableAtTime3: Unit
        get() {
            assertThat(Solution().isReachableAtTime(3, 1, 3, 1, 3), equalTo(true))
        }

    @get:Test
    val isReachableAtTime4: Unit
        get() {
            assertThat(Solution().isReachableAtTime(3, 1, 3, 1, 1), equalTo(false))
        }
}
