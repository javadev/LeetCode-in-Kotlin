package g2201_2300.s2217_find_palindrome_with_fixed_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthPalindrome() {
        assertThat(
            Solution().kthPalindrome(intArrayOf(1, 2, 3, 4, 5, 90), 3),
            equalTo(longArrayOf(101, 111, 121, 131, 141, 999)),
        )
    }

    @Test
    fun kthPalindrome2() {
        assertThat(
            Solution().kthPalindrome(intArrayOf(2, 4, 6), 4),
            equalTo(longArrayOf(1111, 1331, 1551)),
        )
    }
}
