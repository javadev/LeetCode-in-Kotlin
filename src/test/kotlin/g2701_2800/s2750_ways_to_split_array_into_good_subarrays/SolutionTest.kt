package g2701_2800.s2750_ways_to_split_array_into_good_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfGoodSubarraySplits() {
        assertThat(Solution().numberOfGoodSubarraySplits(intArrayOf(0, 1, 0, 0, 1)), equalTo(3))
    }

    @Test
    fun numberOfGoodSubarraySplits2() {
        assertThat(Solution().numberOfGoodSubarraySplits(intArrayOf(0, 1, 0)), equalTo(1))
    }
}
