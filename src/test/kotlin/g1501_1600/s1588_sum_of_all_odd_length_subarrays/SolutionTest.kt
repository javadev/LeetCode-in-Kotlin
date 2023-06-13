package g1501_1600.s1588_sum_of_all_odd_length_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOddLengthSubarrays() {
        assertThat(Solution().sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)), equalTo(58))
    }

    @Test
    fun sumOddLengthSubarrays2() {
        assertThat(Solution().sumOddLengthSubarrays(intArrayOf(1, 2)), equalTo(3))
    }
}
