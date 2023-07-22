package g1701_1800.s1763_longest_nice_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestNiceSubstring() {
        assertThat(Solution().longestNiceSubstring("YazaAay"), equalTo("aAa"))
    }

    @Test
    fun longestNiceSubstring2() {
        assertThat(Solution().longestNiceSubstring("Bb"), equalTo("Bb"))
    }

    @Test
    fun longestNiceSubstring3() {
        assertThat(Solution().longestNiceSubstring("c"), equalTo(""))
    }
}
