package g2701_2800.s2785_sort_vowels_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortVowels() {
        assertThat(Solution().sortVowels("lEetcOde"), equalTo("lEOtcede"))
    }

    @Test
    fun sortVowels2() {
        assertThat(Solution().sortVowels("lYmpH"), equalTo("lYmpH"))
    }
}
