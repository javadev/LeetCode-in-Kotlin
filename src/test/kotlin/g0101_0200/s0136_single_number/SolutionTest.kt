package g0101_0200.s0136_single_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun singleNumber() {
        assertThat(Solution().singleNumber(intArrayOf(2, 2, 1)), equalTo(1))
    }

    @Test
    fun singleNumber2() {
        assertThat(Solution().singleNumber(intArrayOf(4, 1, 2, 1, 2)), equalTo(4))
    }

    @Test
    fun singleNumber3() {
        assertThat(Solution().singleNumber(intArrayOf(1)), equalTo(1))
    }
}
