package g0101_0200.s0128_longest_consecutive_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestConsecutive() {
        assertThat(Solution().longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)), equalTo(4))
    }

    @Test
    fun longestConsecutive2() {
        assertThat(Solution().longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)), equalTo(9))
    }
}
