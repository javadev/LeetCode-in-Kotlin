package g1501_1600.s1536_minimum_swaps_to_arrange_a_binary_grid

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        MatcherAssert.assertThat(
            Solution().minSwaps(arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 0))),
            CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun minSwaps2() {
        MatcherAssert.assertThat(
            Solution()
                .minSwaps(
                    arrayOf(
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0)
                    )
                ),
            CoreMatchers.equalTo(-1)
        )
    }

    @Test
    fun minSwaps3() {
        MatcherAssert.assertThat(
            Solution().minSwaps(arrayOf(intArrayOf(1, 0, 0), intArrayOf(1, 1, 0), intArrayOf(1, 1, 1))),
            CoreMatchers.equalTo(0)
        )
    }
}
