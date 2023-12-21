package g2801_2900.s2871_split_array_into_maximum_number_of_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarrays() {
        assertThat(Solution().maxSubarrays(intArrayOf(1, 0, 2, 0, 1, 2)), equalTo(3))
    }

    @Test
    fun maxSubarrays2() {
        assertThat(Solution().maxSubarrays(intArrayOf(5, 7, 1, 3)), equalTo(1))
    }

    @Test
    fun maxSubarrays3() {
        assertThat(Solution().maxSubarrays(intArrayOf(5)), equalTo(1))
    }
}
