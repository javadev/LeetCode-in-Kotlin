package g0001_0100.s0069_sqrtx

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mySqrt() {
        assertThat(Solution().mySqrt(4), equalTo(2))
    }

    @Test
    fun mySqrt2() {
        assertThat(Solution().mySqrt(8), equalTo(2))
    }
}
