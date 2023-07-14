package g2601_2700.s2609_find_the_longest_balanced_substring_of_a_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheLongestBalancedSubstring() {
        assertThat(Solution().findTheLongestBalancedSubstring("01000111"), equalTo(6))
    }

    @Test
    fun findTheLongestBalancedSubstring2() {
        assertThat(Solution().findTheLongestBalancedSubstring("00111"), equalTo(4))
    }

    @Test
    fun findTheLongestBalancedSubstring3() {
        assertThat(Solution().findTheLongestBalancedSubstring("111"), equalTo(0))
    }
}
