package g2301_2400.s2395_find_subarrays_with_equal_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSubarrays() {
        assertThat(Solution().findSubarrays(intArrayOf(4, 2, 4)), equalTo(true))
    }

    @Test
    fun findSubarrays2() {
        assertThat(Solution().findSubarrays(intArrayOf(1, 2, 3, 4, 5)), equalTo(false))
    }

    @Test
    fun findSubarrays3() {
        assertThat(Solution().findSubarrays(intArrayOf(0, 0, 0)), equalTo(true))
    }
}
