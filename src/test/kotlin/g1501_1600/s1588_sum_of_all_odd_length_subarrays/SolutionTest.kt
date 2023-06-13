package g1501_1600.s1588_sum_of_all_odd_length_subarrays

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOddLengthSubarrays() {
        MatcherAssert.assertThat(Solution().sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)), CoreMatchers.equalTo(58))
    }

    @Test
    fun sumOddLengthSubarrays2() {
        MatcherAssert.assertThat(Solution().sumOddLengthSubarrays(intArrayOf(1, 2)), CoreMatchers.equalTo(3))
    }
}
