package g3501_3600.s3503_longest_palindrome_after_substring_concatenation_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat<Int>(Solution().longestPalindrome("a", "a"), equalTo<Int>(2))
    }

    @Test
    fun longestPalindrome2() {
        assertThat<Int>(Solution().longestPalindrome("abc", "def"), equalTo<Int>(1))
    }

    @Test
    fun longestPalindrome3() {
        assertThat<Int>(Solution().longestPalindrome("b", "aaaa"), equalTo<Int>(4))
    }

    @Test
    fun longestPalindrome4() {
        assertThat<Int>(Solution().longestPalindrome("abcde", "ecdba"), equalTo<Int>(5))
    }
}
