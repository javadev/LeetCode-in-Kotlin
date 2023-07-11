package g2501_2600.s2586_count_the_number_of_vowel_strings_in_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun vowelStrings() {
        assertThat(Solution().vowelStrings(arrayOf("are", "amy", "u"), 0, 2), equalTo(2))
    }

    @Test
    fun vowelStrings2() {
        assertThat(Solution().vowelStrings(arrayOf("hey", "aeo", "mu", "ooo", "artro"), 1, 4), equalTo(3))
    }
}
