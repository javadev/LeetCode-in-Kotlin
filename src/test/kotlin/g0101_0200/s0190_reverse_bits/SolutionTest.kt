package g0101_0200.s0190_reverse_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseBits() {
        assertThat(
            Solution().reverseBits(43261596),
            equalTo(964176192),
        )
    }

    @Test
    fun reverseBits2() {
        assertThat(
            Solution().reverseBits(-3),
            equalTo(-1073741825),
        )
    }
}
