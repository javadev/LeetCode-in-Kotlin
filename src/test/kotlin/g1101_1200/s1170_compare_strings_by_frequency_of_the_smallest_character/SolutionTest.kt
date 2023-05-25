package g1101_1200.s1170_compare_strings_by_frequency_of_the_smallest_character

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSmallerByFrequency() {
        MatcherAssert.assertThat(
            Solution().numSmallerByFrequency(arrayOf("cbd"), arrayOf("zaaaz")),
            CoreMatchers.equalTo(intArrayOf(1))
        )
    }

    @Test
    fun numSmallerByFrequency2() {
        MatcherAssert.assertThat(
            Solution()
                .numSmallerByFrequency(arrayOf("bbb", "cc"), arrayOf("a", "aa", "aaa", "aaaa")),
            CoreMatchers.equalTo(intArrayOf(1, 2))
        )
    }
}
