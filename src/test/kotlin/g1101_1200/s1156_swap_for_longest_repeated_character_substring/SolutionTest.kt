package g1101_1200.s1156_swap_for_longest_repeated_character_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRepOpt1() {
        assertThat(Solution().maxRepOpt1("ababa"), equalTo(3))
    }

    @Test
    fun maxRepOpt12() {
        assertThat(Solution().maxRepOpt1("aaabaaa"), equalTo(6))
    }

    @Test
    fun maxRepOpt13() {
        assertThat(Solution().maxRepOpt1("aaaaa"), equalTo(5))
    }
}
