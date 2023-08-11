package g2201_2300.s2220_minimum_bit_flips_to_convert_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minBitFlips() {
        assertThat(Solution().minBitFlips(10, 7), equalTo(3))
    }

    @Test
    fun minBitFlips2() {
        assertThat(Solution().minBitFlips(3, 4), equalTo(3))
    }
}
