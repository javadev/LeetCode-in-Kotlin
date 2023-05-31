package g1101_1200.s1124_longest_well_performing_interval

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestWPI() {
        assertThat(Solution().longestWPI(intArrayOf(9, 9, 6, 0, 6, 6, 9)), equalTo(3))
    }

    @Test
    fun longestWPI2() {
        assertThat(Solution().longestWPI(intArrayOf(6, 6, 6)), equalTo(0))
    }
}
