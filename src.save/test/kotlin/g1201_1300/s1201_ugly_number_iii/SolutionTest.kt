package g1201_1300.s1201_ugly_number_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthUglyNumber() {
        assertThat(Solution().nthUglyNumber(3, 2, 3, 5), equalTo(4))
    }

    @Test
    fun nthUglyNumber2() {
        assertThat(Solution().nthUglyNumber(4, 2, 3, 4), equalTo(6))
    }

    @Test
    fun nthUglyNumber3() {
        assertThat(Solution().nthUglyNumber(5, 2, 11, 13), equalTo(10))
    }
}
