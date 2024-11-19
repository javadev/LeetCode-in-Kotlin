package g0801_0900.s0888_fair_candy_swap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fairCandySwap() {
        assertThat(
            Solution().fairCandySwap(intArrayOf(1, 1), intArrayOf(2, 2)),
            equalTo(intArrayOf(1, 2)),
        )
    }

    @Test
    fun fairCandySwap2() {
        assertThat(
            Solution().fairCandySwap(intArrayOf(1, 2), intArrayOf(2, 3)),
            equalTo(intArrayOf(1, 2)),
        )
    }

    @Test
    fun fairCandySwap3() {
        assertThat(
            Solution().fairCandySwap(intArrayOf(2), intArrayOf(1, 3)),
            equalTo(intArrayOf(2, 3)),
        )
    }
}
