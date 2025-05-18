package g3501_3600.s3551_minimum_swaps_to_sort_by_digit_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(37, 100)), equalTo<Int>(1))
    }

    @Test
    fun minSwaps2() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(22, 14, 33, 7)), equalTo<Int>(0))
    }

    @Test
    fun minSwaps3() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(18, 43, 34, 16)), equalTo<Int>(2))
    }
}
