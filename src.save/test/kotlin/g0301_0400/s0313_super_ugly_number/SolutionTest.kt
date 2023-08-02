package g0301_0400.s0313_super_ugly_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthSuperUglyNumber() {
        assertThat(Solution().nthSuperUglyNumber(12, intArrayOf(2, 7, 13, 19)), equalTo(32))
    }

    @Test
    fun nthSuperUglyNumber2() {
        assertThat(Solution().nthSuperUglyNumber(1, intArrayOf(2, 3, 5)), equalTo(1))
    }
}
