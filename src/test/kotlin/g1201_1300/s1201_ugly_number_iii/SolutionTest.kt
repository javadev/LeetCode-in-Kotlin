package g1201_1300.s1201_ugly_number_iii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthUglyNumber() {
        MatcherAssert.assertThat(Solution().nthUglyNumber(3, 2, 3, 5), CoreMatchers.equalTo(4))
    }

    @Test
    fun nthUglyNumber2() {
        MatcherAssert.assertThat(Solution().nthUglyNumber(4, 2, 3, 4), CoreMatchers.equalTo(6))
    }

    @Test
    fun nthUglyNumber3() {
        MatcherAssert.assertThat(Solution().nthUglyNumber(5, 2, 11, 13), CoreMatchers.equalTo(10))
    }
}
