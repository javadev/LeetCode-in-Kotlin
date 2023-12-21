package g2801_2900.s2849_determine_if_a_cell_is_reachable_at_a_given_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isReachableAtTime() {
        assertThat(Solution().isReachableAtTime(2, 4, 7, 7, 6), equalTo(true))
    }

    @Test
    fun isReachableAtTime2() {
        assertThat(Solution().isReachableAtTime(3, 1, 7, 3, 3), equalTo(false))
    }

    @Test
    fun isReachableAtTime3() {
        assertThat(Solution().isReachableAtTime(3, 1, 3, 1, 3), equalTo(true))
    }

    @Test
    fun isReachableAtTime4() {
        assertThat(Solution().isReachableAtTime(3, 1, 3, 1, 1), equalTo(false))
    }
}
