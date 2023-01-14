package g0501_0600.s0525_contiguous_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxLength() {
        assertThat(Solution().findMaxLength(intArrayOf(0, 1)), equalTo(2))
    }

    @Test
    fun findMaxLength2() {
        assertThat(Solution().findMaxLength(intArrayOf(0, 1, 0)), equalTo(2))
    }
}
