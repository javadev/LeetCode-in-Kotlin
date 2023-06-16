package g1501_1600.s1525_number_of_good_ways_to_split_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSplits() {
        assertThat(Solution().numSplits("aacaba"), equalTo(2))
    }

    @Test
    fun numSplits2() {
        assertThat(Solution().numSplits("abcd"), equalTo(1))
    }
}
