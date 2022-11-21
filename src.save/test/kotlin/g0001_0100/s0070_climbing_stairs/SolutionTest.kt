package g0001_0100.s0070_climbing_stairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun climbStairs() {
        assertThat(Solution().climbStairs(2), equalTo(2))
    }

    @Test
    fun climbStairs2() {
        assertThat(Solution().climbStairs(3), equalTo(3))
    }
}
