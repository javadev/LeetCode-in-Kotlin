package g0301_0400.s0338_counting_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBits() {
        assertThat(Solution().countBits(2), equalTo(intArrayOf(0, 1, 1)))
    }

    @Test
    fun countBits2() {
        assertThat(Solution().countBits(5), equalTo(intArrayOf(0, 1, 1, 2, 1, 2)))
    }
}
