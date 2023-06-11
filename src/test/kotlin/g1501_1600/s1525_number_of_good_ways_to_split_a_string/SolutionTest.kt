package g1501_1600.s1525_number_of_good_ways_to_split_a_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSplits() {
        MatcherAssert.assertThat(Solution().numSplits("aacaba"), CoreMatchers.equalTo(2))
    }

    @Test
    fun numSplits2() {
        MatcherAssert.assertThat(Solution().numSplits("abcd"), CoreMatchers.equalTo(1))
    }
}
