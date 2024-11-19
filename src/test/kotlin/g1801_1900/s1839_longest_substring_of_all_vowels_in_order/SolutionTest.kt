package g1801_1900.s1839_longest_substring_of_all_vowels_in_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestBeautifulSubstring() {
        assertThat(
            Solution().longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"),
            equalTo(13),
        )
    }

    @Test
    fun longestBeautifulSubstring2() {
        assertThat(Solution().longestBeautifulSubstring("aeeeiiiioooauuuaeiou"), equalTo(5))
    }

    @Test
    fun longestBeautifulSubstring3() {
        assertThat(Solution().longestBeautifulSubstring("a"), equalTo(0))
    }
}
