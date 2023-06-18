package g1601_1700.s1641_count_sorted_vowel_strings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVowelStrings() {
        MatcherAssert.assertThat(Solution().countVowelStrings(1), CoreMatchers.equalTo(5))
    }

    @Test
    fun countVowelStrings2() {
        MatcherAssert.assertThat(Solution().countVowelStrings(2), CoreMatchers.equalTo(15))
    }
}
