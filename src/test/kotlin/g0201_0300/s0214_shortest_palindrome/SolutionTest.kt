package g0201_0300.s0214_shortest_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPalindrome() {
        assertThat(Solution().shortestPalindrome("aacecaaa"), equalTo("aaacecaaa"))
    }

    @Test
    fun shortestPalindrome2() {
        assertThat(Solution().shortestPalindrome("abcd"), equalTo("dcbabcd"))
    }
}
