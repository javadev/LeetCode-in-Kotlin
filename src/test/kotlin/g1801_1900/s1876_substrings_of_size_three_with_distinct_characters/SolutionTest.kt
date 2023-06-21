package g1801_1900.s1876_substrings_of_size_three_with_distinct_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodSubstrings() {
        assertThat(Solution().countGoodSubstrings("xyzzaz"), equalTo(1))
    }

    @Test
    fun countGoodSubstrings2() {
        assertThat(Solution().countGoodSubstrings("aababcabc"), equalTo(4))
    }
}
