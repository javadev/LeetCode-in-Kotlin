package g1501_1600.s1536_minimum_swaps_to_arrange_a_binary_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat(
            Solution().minSwaps(arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 0))),
            equalTo(3)
        )
    }

    @Test
    fun minSwaps2() {
        assertThat(
            Solution()
                .minSwaps(
                    arrayOf(
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0)
                    )
                ),
            equalTo(-1)
        )
    }

    @Test
    fun minSwaps3() {
        assertThat(
            Solution().minSwaps(arrayOf(intArrayOf(1, 0, 0), intArrayOf(1, 1, 0), intArrayOf(1, 1, 1))),
            equalTo(0)
        )
    }
}
