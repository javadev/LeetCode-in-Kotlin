package g3601_3700.s3646_next_special_palindrome_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialPalindrome() {
        assertThat<Long>(Solution().specialPalindrome(2L), equalTo<Long>(22L))
    }

    @Test
    fun specialPalindrome2() {
        assertThat<Long>(Solution().specialPalindrome(33L), equalTo<Long>(212L))
    }
}
