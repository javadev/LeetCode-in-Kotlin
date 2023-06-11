package g1501_1600.s1513_number_of_substrings_with_only_1s

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSub() {
        MatcherAssert.assertThat(Solution().numSub("0110111"), CoreMatchers.equalTo(9))
    }

    @Test
    fun numSub2() {
        MatcherAssert.assertThat(Solution().numSub("101"), CoreMatchers.equalTo(2))
    }

    @Test
    fun numSub3() {
        MatcherAssert.assertThat(Solution().numSub("111111"), CoreMatchers.equalTo(21))
    }
}
