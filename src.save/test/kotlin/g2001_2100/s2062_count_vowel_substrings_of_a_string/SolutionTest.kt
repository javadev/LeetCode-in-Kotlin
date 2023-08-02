package g2001_2100.s2062_count_vowel_substrings_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVowelSubstrings() {
        assertThat(Solution().countVowelSubstrings("aeiouu"), equalTo(2))
    }

    @Test
    fun countVowelSubstrings2() {
        assertThat(Solution().countVowelSubstrings("unicornarihan"), equalTo(0))
    }

    @Test
    fun countVowelSubstrings3() {
        assertThat(Solution().countVowelSubstrings("cuaieuouac"), equalTo(7))
    }
}
