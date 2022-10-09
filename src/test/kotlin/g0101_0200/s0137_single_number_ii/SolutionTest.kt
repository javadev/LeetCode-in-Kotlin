package g0101_0200.s0137_single_number_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun singleNumber() {
        assertThat(Solution().singleNumber(intArrayOf(2, 2, 3, 2)), equalTo(3))
    }

    @Test
    fun singleNumber2() {
        assertThat(Solution().singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)), equalTo(99))
    }
}
