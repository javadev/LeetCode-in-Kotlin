package g1301_1400.s1347_minimum_number_of_steps_to_make_two_strings_anagram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSteps() {
        assertThat(Solution().minSteps("bab", "aba"), equalTo(1))
    }

    @Test
    fun minSteps2() {
        assertThat(Solution().minSteps("leetcode", "practice"), equalTo(5))
    }

    @Test
    fun minSteps3() {
        assertThat(Solution().minSteps("anagram", "anagram"), equalTo(0))
    }
}
