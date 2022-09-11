package g0301_0400.s0322_coin_change

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun coinChange() {
        assertThat(Solution().coinChange(intArrayOf(1, 2, 5), 11), equalTo(3))
    }

    @Test
    fun coinChange2() {
        assertThat(Solution().coinChange(intArrayOf(2), 3), equalTo(-1))
    }

    @Test
    fun coinChange3() {
        assertThat(Solution().coinChange(intArrayOf(1), 0), equalTo(0))
    }
}
