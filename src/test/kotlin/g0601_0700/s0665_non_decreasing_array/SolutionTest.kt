package g0601_0700.s0665_non_decreasing_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPossibility() {
        assertThat(Solution().checkPossibility(intArrayOf(4, 2, 3)), equalTo(true))
    }

    @Test
    fun checkPossibility2() {
        assertThat(Solution().checkPossibility(intArrayOf(4, 2, 1)), equalTo(false))
    }
}
