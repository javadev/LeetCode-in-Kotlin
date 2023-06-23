package g2101_2200.s2134_minimum_swaps_to_group_all_1s_together_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat(Solution().minSwaps(intArrayOf(0, 1, 0, 1, 1, 0, 0)), equalTo(1))
    }

    @Test
    fun minSwaps2() {
        assertThat(Solution().minSwaps(intArrayOf(0, 1, 1, 1, 0, 0, 1, 1, 0)), equalTo(2))
    }

    @Test
    fun minSwaps3() {
        assertThat(Solution().minSwaps(intArrayOf(1, 1, 0, 0, 1)), equalTo(0))
    }
}
