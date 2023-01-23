package g0501_0600.s0564_find_the_closest_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nearestPalindromic() {
        assertThat(Solution().nearestPalindromic("123"), equalTo("121"))
    }

    @Test
    fun nearestPalindromic2() {
        assertThat(Solution().nearestPalindromic("1"), equalTo("0"))
    }
}
