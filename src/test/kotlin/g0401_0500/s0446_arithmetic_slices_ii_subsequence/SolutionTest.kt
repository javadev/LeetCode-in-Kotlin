package g0401_0500.s0446_arithmetic_slices_ii_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfArithmeticSlices() {
        assertThat(Solution().numberOfArithmeticSlices(intArrayOf(2, 4, 6, 8, 10)), equalTo(7))
    }

    @Test
    fun numberOfArithmeticSlices2() {
        assertThat(Solution().numberOfArithmeticSlices(intArrayOf(7, 7, 7, 7, 7)), equalTo(16))
    }
}
