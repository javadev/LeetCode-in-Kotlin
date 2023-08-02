package g1101_1200.s1170_compare_strings_by_frequency_of_the_smallest_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSmallerByFrequency() {
        assertThat(
            Solution().numSmallerByFrequency(arrayOf("cbd"), arrayOf("zaaaz")),
            equalTo(intArrayOf(1))
        )
    }

    @Test
    fun numSmallerByFrequency2() {
        assertThat(
            Solution()
                .numSmallerByFrequency(arrayOf("bbb", "cc"), arrayOf("a", "aa", "aaa", "aaaa")),
            equalTo(intArrayOf(1, 2))
        )
    }
}
