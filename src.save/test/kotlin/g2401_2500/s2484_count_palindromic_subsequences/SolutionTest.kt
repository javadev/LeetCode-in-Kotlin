package g2401_2500.s2484_count_palindromic_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPalindromes() {
        assertThat(Solution().countPalindromes("103301"), equalTo(2))
    }

    @Test
    fun countPalindromes2() {
        assertThat(Solution().countPalindromes("0000000"), equalTo(21))
    }

    @Test
    fun countPalindromes3() {
        assertThat(Solution().countPalindromes("9999900000"), equalTo(2))
    }
}
