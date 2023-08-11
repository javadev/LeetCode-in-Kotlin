package g2501_2600.s2588_count_the_number_of_beautiful_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulSubarrays() {
        assertThat(Solution().beautifulSubarrays(intArrayOf(4, 3, 1, 2, 4)), equalTo(2))
    }

    @Test
    fun beautifulSubarrays2() {
        assertThat(Solution().beautifulSubarrays(intArrayOf(1, 10, 4)), equalTo(0))
    }
}
