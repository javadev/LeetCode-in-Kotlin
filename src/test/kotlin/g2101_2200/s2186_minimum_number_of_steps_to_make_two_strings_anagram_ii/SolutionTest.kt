package g2101_2200.s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSteps() {
        MatcherAssert.assertThat(Solution().minSteps("leetcode", "coats"), CoreMatchers.equalTo(7))
    }

    @Test
    fun minSteps2() {
        MatcherAssert.assertThat(Solution().minSteps("night", "thing"), CoreMatchers.equalTo(0))
    }
}
