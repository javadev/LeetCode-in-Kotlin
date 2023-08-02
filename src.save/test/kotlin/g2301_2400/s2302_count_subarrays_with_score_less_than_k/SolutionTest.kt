package g2301_2400.s2302_count_subarrays_with_score_less_than_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat(Solution().countSubarrays(intArrayOf(2, 1, 4, 3, 5), 10), equalTo(6L))
    }

    @Test
    fun countSubarrays2() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 1, 1), 5), equalTo(5L))
    }
}
