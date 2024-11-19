package g2601_2700.s2697_lexicographically_smallest_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeSmallestPalindrome() {
        assertThat(
            Solution().makeSmallestPalindrome("egcfe"),
            equalTo("efcfe"),
        )
    }

    @Test
    fun makeSmallestPalindrome2() {
        assertThat(
            Solution().makeSmallestPalindrome("abcd"),
            equalTo("abba"),
        )
    }

    @Test
    fun makeSmallestPalindrome3() {
        assertThat(
            Solution().makeSmallestPalindrome("seven"),
            equalTo("neven"),
        )
    }
}
