package g0701_0800.s0754_reach_a_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reachNumber() {
        assertThat(Solution().reachNumber(2), equalTo(3))
    }

    @Test
    fun reachNumber2() {
        assertThat(Solution().reachNumber(3), equalTo(2))
    }
}
