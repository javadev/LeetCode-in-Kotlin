package g0901_1000.s0991_broken_calculator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun brokenCalc() {
        assertThat(Solution().brokenCalc(2, 3), equalTo(2))
    }

    @Test
    fun brokenCalc2() {
        assertThat(Solution().brokenCalc(5, 8), equalTo(2))
    }

    @Test
    fun brokenCalc3() {
        assertThat(Solution().brokenCalc(3, 10), equalTo(3))
    }
}
