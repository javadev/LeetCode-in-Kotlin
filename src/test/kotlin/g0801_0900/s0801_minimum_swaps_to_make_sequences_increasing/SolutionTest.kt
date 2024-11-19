package g0801_0900.s0801_minimum_swaps_to_make_sequences_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwap() {
        assertThat(
            Solution().minSwap(intArrayOf(1, 3, 5, 4), intArrayOf(1, 2, 3, 7)),
            equalTo(1),
        )
    }

    @Test
    fun minSwap2() {
        assertThat(
            Solution().minSwap(intArrayOf(0, 3, 5, 8, 9), intArrayOf(2, 1, 4, 6, 9)),
            equalTo(1),
        )
    }
}
