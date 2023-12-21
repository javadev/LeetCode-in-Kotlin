package g2801_2900.s2871_split_array_into_maximum_number_of_subarrays

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarrays() {
        MatcherAssert.assertThat(Solution().maxSubarrays(intArrayOf(1, 0, 2, 0, 1, 2)), CoreMatchers.equalTo(3))
    }

    @Test
    fun maxSubarrays2() {
        MatcherAssert.assertThat(Solution().maxSubarrays(intArrayOf(5, 7, 1, 3)), CoreMatchers.equalTo(1))
    }

    @Test
    fun maxSubarrays3() {
        MatcherAssert.assertThat(Solution().maxSubarrays(intArrayOf(5)), CoreMatchers.equalTo(1))
    }
}
