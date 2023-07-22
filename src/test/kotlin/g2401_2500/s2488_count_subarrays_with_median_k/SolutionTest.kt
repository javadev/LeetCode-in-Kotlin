package g2401_2500.s2488_count_subarrays_with_median_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat(Solution().countSubarrays(intArrayOf(3, 2, 1, 4, 5), 4), equalTo(3))
    }

    @Test
    fun countSubarrays2() {
        assertThat(Solution().countSubarrays(intArrayOf(2, 3, 1), 3), equalTo(1))
    }
}
