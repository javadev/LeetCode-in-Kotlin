package g0801_0900.s0866_prime_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun primePalindrome() {
        assertThat(Solution().primePalindrome(6), equalTo(7))
    }

    @Test
    fun primePalindrome2() {
        assertThat(Solution().primePalindrome(8), equalTo(11))
    }

    @Test
    fun primePalindrome3() {
        assertThat(Solution().primePalindrome(13), equalTo(101))
    }
}
