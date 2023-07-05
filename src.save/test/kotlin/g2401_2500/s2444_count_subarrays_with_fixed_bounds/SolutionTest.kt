package g2401_2500.s2444_count_subarrays_with_fixed_bounds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat(
            Solution().countSubarrays(intArrayOf(1, 3, 5, 2, 7, 5), 1, 5),
            equalTo(2L)
        )
    }

    @Test
    fun countSubarrays2() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 1, 1, 1), 1, 1), equalTo(10L))
    }
}
