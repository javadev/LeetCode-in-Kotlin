package g1501_1600.s1513_number_of_substrings_with_only_1s

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSub() {
        assertThat(Solution().numSub("0110111"), equalTo(9))
    }

    @Test
    fun numSub2() {
        assertThat(Solution().numSub("101"), equalTo(2))
    }

    @Test
    fun numSub3() {
        assertThat(Solution().numSub("111111"), equalTo(21))
    }
}
