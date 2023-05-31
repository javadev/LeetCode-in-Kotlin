package g1101_1200.s1124_longest_well_performing_interval

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestWPI() {
        MatcherAssert.assertThat(Solution().longestWPI(intArrayOf(9, 9, 6, 0, 6, 6, 9)), CoreMatchers.equalTo(3))
    }

    @Test
    fun longestWPI2() {
        MatcherAssert.assertThat(Solution().longestWPI(intArrayOf(6, 6, 6)), CoreMatchers.equalTo(0))
    }
}
