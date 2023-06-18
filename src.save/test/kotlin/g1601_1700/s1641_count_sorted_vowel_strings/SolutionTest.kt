package g1601_1700.s1641_count_sorted_vowel_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVowelStrings() {
        assertThat(Solution().countVowelStrings(1), equalTo(5))
    }

    @Test
    fun countVowelStrings2() {
        assertThat(Solution().countVowelStrings(2), equalTo(15))
    }
}
