package g2801_2900.s2808_minimum_seconds_to_equalize_a_circular_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSeconds() {
        assertThat(Solution().minimumSeconds(mutableListOf(2, 1, 3, 3, 2)), equalTo(2))
    }

    @Test
    fun minimumSeconds2() {
        assertThat(Solution().minimumSeconds(mutableListOf(5, 5, 5, 5)), equalTo(0))
    }
}
