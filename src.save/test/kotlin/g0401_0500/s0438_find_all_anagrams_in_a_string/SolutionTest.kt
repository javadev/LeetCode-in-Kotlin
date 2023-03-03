package g0401_0500.s0438_find_all_anagrams_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAnagrams() {
        assertThat(Solution().findAnagrams("cbaebabacd", "abc"), equalTo(listOf(0, 6)))
    }

    @Test
    fun findAnagrams2() {
        assertThat(Solution().findAnagrams("abab", "ab"), equalTo(listOf(0, 1, 2)))
    }
}
