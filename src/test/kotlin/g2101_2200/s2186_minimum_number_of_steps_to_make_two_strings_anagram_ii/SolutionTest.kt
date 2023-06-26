package g2101_2200.s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSteps() {
        assertThat(Solution().minSteps("leetcode", "coats"), equalTo(7))
    }

    @Test
    fun minSteps2() {
        assertThat(Solution().minSteps("night", "thing"), equalTo(0))
    }
}
