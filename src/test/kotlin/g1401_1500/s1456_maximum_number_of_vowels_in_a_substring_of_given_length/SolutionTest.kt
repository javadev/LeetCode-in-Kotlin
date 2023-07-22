package g1401_1500.s1456_maximum_number_of_vowels_in_a_substring_of_given_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxVowels() {
        assertThat(Solution().maxVowels("abciiidef", 3), equalTo(3))
    }

    @Test
    fun maxVowels2() {
        assertThat(Solution().maxVowels("aeiou", 2), equalTo(2))
    }

    @Test
    fun maxVowels3() {
        assertThat(Solution().maxVowels("leetcode", 3), equalTo(2))
    }
}
