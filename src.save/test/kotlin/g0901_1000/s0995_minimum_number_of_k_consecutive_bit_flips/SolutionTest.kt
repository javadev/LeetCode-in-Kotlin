package g0901_1000.s0995_minimum_number_of_k_consecutive_bit_flips

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minKBitFlips() {
        assertThat(Solution().minKBitFlips(intArrayOf(0, 1, 0), 1), equalTo(2))
    }

    @Test
    fun minKBitFlips2() {
        assertThat(Solution().minKBitFlips(intArrayOf(1, 1, 0), 2), equalTo(-1))
    }

    @Test
    fun minKBitFlips3() {
        assertThat(Solution().minKBitFlips(intArrayOf(0, 0, 0, 1, 0, 1, 1, 0), 3), equalTo(3))
    }
}
