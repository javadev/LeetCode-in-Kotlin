package g0001_0100.s0091_decode_ways

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numDecodings() {
        assertThat(Solution().numDecodings("12"), equalTo(2))
    }

    @Test
    fun numDecodings2() {
        assertThat(Solution().numDecodings("226"), equalTo(3))
    }

    @Test
    fun numDecodings3() {
        assertThat(Solution().numDecodings("06"), equalTo(0))
    }
}
