package g0401_0500.s0413_arithmetic_slices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfArithmeticSlices() {
        assertThat(Solution().numberOfArithmeticSlices(intArrayOf(1, 2, 3, 4)), equalTo(3))
    }

    @Test
    fun numberOfArithmeticSlices2() {
        assertThat(Solution().numberOfArithmeticSlices(intArrayOf(1)), equalTo(0))
    }
}
