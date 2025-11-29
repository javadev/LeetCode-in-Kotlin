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

    @Test
    fun nearestPalindromic3() {
        assertThat(Solution().nearestPalindromic("121"), equalTo("111"))
    }

    @Test
    fun nearestPalindromic4() {
        assertThat(Solution().nearestPalindromic("100"), equalTo("99"))
    }

    @Test
    fun nearestPalindromic5() {
        assertThat(Solution().nearestPalindromic("2"), equalTo("1"))
    }

    @Test
    fun nearestPalindromic6() {
        assertThat(Solution().nearestPalindromic("999"), equalTo("1001"))
    }

    @Test
    fun nearestPalindromic7() {
        assertThat(Solution().nearestPalindromic("1221"), equalTo("1111"))
    }

    @Test
    fun nearestPalindromic8() {
        assertThat(Solution().nearestPalindromic("12321"), equalTo("12221"))
    }

    @Test
    fun nearestPalindromic9() {
        assertThat(Solution().nearestPalindromic("1000001"), equalTo("999999"))
    }

    @Test
    fun nearestPalindromic10() {
        assertThat(Solution().nearestPalindromic("10"), equalTo("9"))
    }

    @Test
    fun nearestPalindromic11() {
        assertThat(Solution().nearestPalindromic("11"), equalTo("9"))
    }

    @Test
    fun nearestPalindromic12() {
        assertThat(Solution().nearestPalindromic("807"), equalTo("808"))
    }

    @Test
    fun nearestPalindromic13() {
        assertThat(Solution().nearestPalindromic("1000"), equalTo("999"))
    }
}
