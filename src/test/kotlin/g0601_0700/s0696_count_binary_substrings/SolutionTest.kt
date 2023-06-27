package g0601_0700.s0696_count_binary_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBinarySubstrings() {
        assertThat(Solution().countBinarySubstrings("00110011"), equalTo(6))
    }

    @Test
    fun countBinarySubstrings2() {
        assertThat(Solution().countBinarySubstrings("10101"), equalTo(4))
    }
}
