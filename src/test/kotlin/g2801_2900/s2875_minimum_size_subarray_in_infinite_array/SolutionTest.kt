package g2801_2900.s2875_minimum_size_subarray_in_infinite_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSizeSubarray() {
        assertThat(Solution().minSizeSubarray(intArrayOf(1, 2, 3), 5), equalTo(2))
    }

    @Test
    fun minSizeSubarray2() {
        assertThat(Solution().minSizeSubarray(intArrayOf(1, 1, 1, 2, 3), 4), equalTo(2))
    }

    @Test
    fun minSizeSubarray3() {
        assertThat(Solution().minSizeSubarray(intArrayOf(2, 4, 6, 8), 3), equalTo(-1))
    }

    @Test
    fun minSizeSubarray4() {
        assertThat(Solution().minSizeSubarray(intArrayOf(0), 1), equalTo(-1))
    }
}
