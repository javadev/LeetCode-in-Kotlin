package g2001_2100.s2063_vowels_of_all_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVowels() {
        assertThat(Solution().countVowels("aba"), equalTo(6L))
    }

    @Test
    fun countVowels2() {
        assertThat(Solution().countVowels("abc"), equalTo(3L))
    }

    @Test
    fun countVowels3() {
        assertThat(Solution().countVowels("ltcd"), equalTo(0L))
    }
}
