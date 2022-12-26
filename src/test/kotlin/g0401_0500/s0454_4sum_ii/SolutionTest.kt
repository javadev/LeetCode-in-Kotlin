package g0401_0500.s0454_4sum_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fourSumCount() {
        assertThat(
            Solution()
                .fourSumCount(intArrayOf(1, 2), intArrayOf(-2, -1), intArrayOf(-1, 2), intArrayOf(0, 2)),
            equalTo(2)
        )
    }

    @Test
    fun fourSumCount2() {
        assertThat(
            Solution()
                .fourSumCount(intArrayOf(0), intArrayOf(0), intArrayOf(0), intArrayOf(0)),
            equalTo(1)
        )
    }
}
