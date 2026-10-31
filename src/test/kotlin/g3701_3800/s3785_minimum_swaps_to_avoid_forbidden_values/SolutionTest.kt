package g3701_3800.s3785_minimum_swaps_to_avoid_forbidden_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat<Int>(
            Solution().minSwaps(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minSwaps2() {
        assertThat<Int>(
            Solution().minSwaps(intArrayOf(4, 6, 6, 5), intArrayOf(4, 6, 5, 5)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minSwaps3() {
        assertThat<Int>(
            Solution().minSwaps(intArrayOf(7, 7), intArrayOf(8, 7)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minSwaps4() {
        assertThat<Int>(
            Solution().minSwaps(intArrayOf(1, 2), intArrayOf(2, 1)),
            equalTo<Int>(0),
        )
    }
}
