package g0801_0900.s0891_sum_of_subsequence_widths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumSubseqWidths() {
        assertThat(Solution().sumSubseqWidths(intArrayOf(2, 1, 3)), equalTo(6))
    }

    @Test
    fun sumSubseqWidths2() {
        assertThat(Solution().sumSubseqWidths(intArrayOf(2)), equalTo(0))
    }
}
