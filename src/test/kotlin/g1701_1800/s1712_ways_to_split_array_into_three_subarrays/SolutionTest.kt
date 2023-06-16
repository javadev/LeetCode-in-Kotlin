package g1701_1800.s1712_ways_to_split_array_into_three_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToSplit() {
        assertThat(Solution().waysToSplit(intArrayOf(1, 1, 1)), equalTo(1))
    }

    @Test
    fun waysToSplit2() {
        assertThat(Solution().waysToSplit(intArrayOf(1, 2, 2, 2, 5, 0)), equalTo(3))
    }

    @Test
    fun waysToSplit3() {
        assertThat(Solution().waysToSplit(intArrayOf(3, 2, 1)), equalTo(0))
    }
}
