package g3901_4000.s3994_minimum_adjacent_swaps_to_partition_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAdjacentSwaps() {
        assertThat<Int>(
            Solution().minAdjacentSwaps(intArrayOf(1, 3, 2, 4, 5, 6), 3, 4),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minAdjacentSwaps2() {
        assertThat<Int>(
            Solution().minAdjacentSwaps(intArrayOf(9, 7, 5, 3), 4, 8),
            equalTo<Int>(5),
        )
    }

    @Test
    fun minAdjacentSwaps3() {
        assertThat<Int>(
            Solution().minAdjacentSwaps(intArrayOf(3, 7, 5, 9), 4, 8),
            equalTo<Int>(0),
        )
    }
}
