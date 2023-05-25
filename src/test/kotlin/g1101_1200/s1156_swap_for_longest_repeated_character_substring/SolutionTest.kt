package g1101_1200.s1156_swap_for_longest_repeated_character_substring

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRepOpt1() {
        MatcherAssert.assertThat(Solution().maxRepOpt1("ababa"), CoreMatchers.equalTo(3))
    }

    @Test
    fun maxRepOpt12() {
        MatcherAssert.assertThat(Solution().maxRepOpt1("aaabaaa"), CoreMatchers.equalTo(6))
    }

    @Test
    fun maxRepOpt13() {
        MatcherAssert.assertThat(Solution().maxRepOpt1("aaaaa"), CoreMatchers.equalTo(5))
    }
}
