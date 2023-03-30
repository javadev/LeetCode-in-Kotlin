package g0801_0900.s0852_peak_index_in_a_mountain_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun peakIndexInMountainArray() {
        assertThat(Solution().peakIndexInMountainArray(intArrayOf(0, 1, 0)), equalTo(1))
    }

    @Test
    fun peakIndexInMountainArray2() {
        assertThat(Solution().peakIndexInMountainArray(intArrayOf(0, 2, 1, 0)), equalTo(1))
    }

    @Test
    fun peakIndexInMountainArray3() {
        assertThat(Solution().peakIndexInMountainArray(intArrayOf(0, 10, 5, 2)), equalTo(1))
    }
}
