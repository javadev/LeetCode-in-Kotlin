package g3801_3900.s3856_trim_trailing_vowels

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trimTrailingVowels() {
        assertThat<String>(Solution().trimTrailingVowels("idea"), equalTo<String>("id"))
    }

    @Test
    fun trimTrailingVowels2() {
        assertThat<String>(Solution().trimTrailingVowels("day"), equalTo<String>("day"))
    }

    @Test
    fun trimTrailingVowels3() {
        assertThat<String>(Solution().trimTrailingVowels("aeiou"), equalTo<String>(""))
    }
}
