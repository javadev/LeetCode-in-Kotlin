package g0301_0400.s0393_utf_8_validation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validUtf8() {
        assertThat(Solution().validUtf8(intArrayOf(197, 130, 1)), equalTo(true))
    }

    @Test
    fun validUtf82() {
        assertThat(Solution().validUtf8(intArrayOf(235, 140, 4)), equalTo(false))
    }
}
