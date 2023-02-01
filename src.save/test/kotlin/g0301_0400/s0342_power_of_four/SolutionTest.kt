package g0301_0400.s0342_power_of_four

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPowerOfFour() {
        assertThat(Solution().isPowerOfFour(16), equalTo(true))
    }

    @Test
    fun isPowerOfFour2() {
        assertThat(Solution().isPowerOfFour(5), equalTo(false))
    }

    @Test
    fun isPowerOfFour3() {
        assertThat(Solution().isPowerOfFour(1), equalTo(true))
    }
}
