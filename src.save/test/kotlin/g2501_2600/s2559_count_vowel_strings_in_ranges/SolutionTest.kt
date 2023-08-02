package g2501_2600.s2559_count_vowel_strings_in_ranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun vowelStrings() {
        assertThat(
            Solution().vowelStrings(
                arrayOf("aba", "bcb", "ece", "aa", "e"),
                arrayOf(
                    intArrayOf(0, 2),
                    intArrayOf(1, 4), intArrayOf(1, 1)
                )
            ),
            equalTo(intArrayOf(2, 3, 0))
        )
    }

    @Test
    fun vowelStrings2() {
        assertThat(
            Solution().vowelStrings(
                arrayOf("a", "e", "i"),
                arrayOf(
                    intArrayOf(0, 2), intArrayOf(0, 1),
                    intArrayOf(2, 2)
                )
            ),
            equalTo(intArrayOf(3, 2, 1))
        )
    }
}
