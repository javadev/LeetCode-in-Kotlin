package g2701_2800.s2799_count_complete_subarrays_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteSubarrays() {
        assertThat(Solution().countCompleteSubarrays(intArrayOf(1, 3, 1, 2, 2)), equalTo(4))
    }

    @Test
    fun countCompleteSubarrays2() {
        assertThat(Solution().countCompleteSubarrays(intArrayOf(5, 5, 5, 5)), equalTo(10))
    }
}
