package g0301_0400.s0377_combination_sum_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun combinationSum4() {
        assertThat(Solution().combinationSum4(intArrayOf(1, 2, 3), 4), equalTo(7))
    }

    @Test
    fun combinationSum42() {
        assertThat(Solution().combinationSum4(intArrayOf(9), 3), equalTo(0))
    }
}
