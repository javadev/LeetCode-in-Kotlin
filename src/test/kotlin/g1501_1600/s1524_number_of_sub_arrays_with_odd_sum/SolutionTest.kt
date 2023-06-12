package g1501_1600.s1524_number_of_sub_arrays_with_odd_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfSubarrays() {
        assertThat(Solution().numOfSubarrays(intArrayOf(1, 3, 5)), equalTo(4))
    }

    @Test
    fun numOfSubarrays2() {
        assertThat(Solution().numOfSubarrays(intArrayOf(2, 4, 6)), equalTo(0))
    }

    @Test
    fun numOfSubarrays3() {
        assertThat(Solution().numOfSubarrays(intArrayOf(1, 2, 3, 4, 5, 6, 7)), equalTo(16))
    }
}
