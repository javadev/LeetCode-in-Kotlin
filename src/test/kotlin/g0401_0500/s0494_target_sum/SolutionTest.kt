package g0401_0500.s0494_target_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTargetSumWays() {
        assertThat(Solution().findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3), equalTo(5))
    }

    @Test
    fun findTargetSumWays2() {
        assertThat(Solution().findTargetSumWays(intArrayOf(1), 1), equalTo(1))
    }
}
