package g2401_2500.s2472_maximum_number_of_non_overlapping_palindrome_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPalindromes() {
        assertThat(Solution().maxPalindromes("abaccdbbd", 3), equalTo(2))
    }

    @Test
    fun maxPalindromes2() {
        assertThat(Solution().maxPalindromes("adbcda", 2), equalTo(0))
    }
}
