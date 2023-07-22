package g2201_2300.s2289_steps_to_make_array_non_decreasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalSteps() {
        assertThat(
            Solution().totalSteps(intArrayOf(5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11)),
            equalTo(3)
        )
    }

    @Test
    fun totalSteps2() {
        assertThat(Solution().totalSteps(intArrayOf(4, 5, 7, 7, 13)), equalTo(0))
    }
}
