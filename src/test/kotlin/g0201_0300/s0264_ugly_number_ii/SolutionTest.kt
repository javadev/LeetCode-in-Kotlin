package g0201_0300.s0264_ugly_number_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthUglyNumber() {
        assertThat(Solution().nthUglyNumber(10), equalTo(12))
    }

    @Test
    fun nthUglyNumber2() {
        assertThat(Solution().nthUglyNumber(1), equalTo(1))
    }
}
