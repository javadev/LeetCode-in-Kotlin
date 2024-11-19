package g2101_2200.s2108_find_first_palindromic_string_in_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstPalindrome() {
        assertThat(
            Solution()
                .firstPalindrome(arrayOf("abc", "car", "ada", "racecar", "cool")),
            equalTo("ada"),
        )
    }

    @Test
    fun firstPalindrome2() {
        assertThat(
            Solution().firstPalindrome(arrayOf("notapalindrome", "racecar")),
            equalTo("racecar"),
        )
    }

    @Test
    fun firstPalindrome3() {
        assertThat(Solution().firstPalindrome(arrayOf("def", "ghi")), equalTo(""))
    }
}
