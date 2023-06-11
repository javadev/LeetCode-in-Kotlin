package g1501_1600.s1524_number_of_sub_arrays_with_odd_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfSubarrays() {
        MatcherAssert.assertThat(Solution().numOfSubarrays(intArrayOf(1, 3, 5)), CoreMatchers.equalTo(4))
    }

    @Test
    fun numOfSubarrays2() {
        MatcherAssert.assertThat(Solution().numOfSubarrays(intArrayOf(2, 4, 6)), CoreMatchers.equalTo(0))
    }

    @Test
    fun numOfSubarrays3() {
        MatcherAssert.assertThat(Solution().numOfSubarrays(intArrayOf(1, 2, 3, 4, 5, 6, 7)), CoreMatchers.equalTo(16))
    }
}
