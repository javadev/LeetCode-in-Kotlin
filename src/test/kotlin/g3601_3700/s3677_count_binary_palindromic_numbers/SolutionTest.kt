package g3601_3700.s3677_count_binary_palindromic_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBinaryPalindromes() {
        assertThat<Int>(Solution().countBinaryPalindromes(9L), equalTo<Int>(6))
    }

    @Test
    fun countBinaryPalindromes2() {
        assertThat<Int>(Solution().countBinaryPalindromes(9L), equalTo<Int>(6))
    }

    @Test
    fun countBinaryPalindromes3() {
        // Branch: n == 0 → returns 1 immediately
        assertThat<Int>(Solution().countBinaryPalindromes(0), equalTo<Int>(1))
    }

    @Test
    fun countBinaryPalindromes4() {
        // n = 1 ("1") → palindrome
        // Expected palindromes: 1 (0) + 1 (1) = 2
        assertThat<Int>(Solution().countBinaryPalindromes(1), equalTo<Int>(2))
    }

    @Test
    fun countBinaryPalindromes5() {
        // n = 6 ("110"), length = 3 (odd)
        // Palindromes up to 6: 0,1,3,5
        assertThat<Int>(Solution().countBinaryPalindromes(6), equalTo<Int>(4))
    }

    @Test
    fun countBinaryPalindromes6() {
        // n = 9 ("1001"), palindrome itself
        // Palindromes up to 9: 0,1,3,5,7,9
        assertThat<Int>(Solution().countBinaryPalindromes(9), equalTo<Int>(6))
    }

    @Test
    fun countBinaryPalindromes7() {
        // n = 10 ("1010") → next palindrome = 9 (smaller) → branch where palin <= n
        // Palindromes up to 10: 0,1,3,5,7,9
        assertThat<Int>(Solution().countBinaryPalindromes(10), equalTo<Int>(6))
    }

    @Test
    fun countBinaryPalindromes8() {
        // 1023 = "1111111111"
        val n = (1L shl 10) - 1
        assertThat<Int>(Solution().countBinaryPalindromes(n), equalTo<Int>(63))
    }
}
