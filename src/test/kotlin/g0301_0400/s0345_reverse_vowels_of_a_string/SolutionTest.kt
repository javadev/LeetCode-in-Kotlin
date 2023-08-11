package g0301_0400.s0345_reverse_vowels_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseVowels() {
        assertThat(Solution().reverseVowels("hello"), equalTo("holle"))
    }

    @Test
    fun reverseVowels2() {
        assertThat(Solution().reverseVowels("leetcode"), equalTo("leotcede"))
    }
}
