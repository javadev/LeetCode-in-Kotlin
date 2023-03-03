package g0301_0400.s0326_power_of_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPowerOfThree() {
        assertThat(Solution().isPowerOfThree(27), equalTo(true))
    }

    @Test
    fun isPowerOfThree2() {
        assertThat(Solution().isPowerOfThree(0), equalTo(false))
    }

    @Test
    fun isPowerOfThree3() {
        assertThat(Solution().isPowerOfThree(9), equalTo(true))
    }
}
