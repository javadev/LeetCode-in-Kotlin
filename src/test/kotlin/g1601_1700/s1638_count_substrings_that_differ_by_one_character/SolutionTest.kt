package g1601_1700.s1638_count_substrings_that_differ_by_one_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubstrings() {
        assertThat(Solution().countSubstrings("aba", "baba"), equalTo(6))
    }

    @Test
    fun countSubstrings2() {
        assertThat(Solution().countSubstrings("ab", "bb"), equalTo(3))
    }
}
