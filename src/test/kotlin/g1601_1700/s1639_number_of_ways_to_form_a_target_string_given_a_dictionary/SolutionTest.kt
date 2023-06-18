package g1601_1700.s1639_number_of_ways_to_form_a_target_string_given_a_dictionary

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWays() {
        MatcherAssert.assertThat(
            Solution().numWays(arrayOf("acca", "bbbb", "caca"), "aba"), CoreMatchers.equalTo(6)
        )
    }

    @Test
    fun numWays2() {
        MatcherAssert.assertThat(Solution().numWays(arrayOf("abba", "baab"), "bab"), CoreMatchers.equalTo(4))
    }
}
