package g0601_0700.s0639_decode_ways_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numDecodings() {
        assertThat(Solution().numDecodings("*"), equalTo(9))
    }

    @Test
    fun numDecodings2() {
        assertThat(Solution().numDecodings("1*"), equalTo(18))
    }

    @Test
    fun numDecodings3() {
        assertThat(Solution().numDecodings("2*"), equalTo(15))
    }

    @Test
    fun numDecodings4() {
        assertThat(Solution().numDecodings("134*92*0*9*"), equalTo(3600))
    }
}
