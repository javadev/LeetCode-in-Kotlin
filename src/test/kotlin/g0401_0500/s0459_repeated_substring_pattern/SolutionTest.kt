package g0401_0500.s0459_repeated_substring_pattern

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatedSubstringPattern() {
        assertThat(Solution().repeatedSubstringPattern("abab"), equalTo(true))
    }

    @Test
    fun repeatedSubstringPattern2() {
        assertThat(Solution().repeatedSubstringPattern("aba"), equalTo(false))
    }

    @Test
    fun repeatedSubstringPattern3() {
        assertThat(Solution().repeatedSubstringPattern("abcabcabcabc"), equalTo(true))
    }
}
