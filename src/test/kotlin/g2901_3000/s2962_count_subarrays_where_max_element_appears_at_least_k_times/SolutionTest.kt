package g2901_3000.s2962_count_subarrays_where_max_element_appears_at_least_k_times

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 3, 2, 3, 3), 2), equalTo(6L))
    }

    @Test
    fun countSubarrays2() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 4, 2, 1), 3), equalTo(0L))
    }
}
