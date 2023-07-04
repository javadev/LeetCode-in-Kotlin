package g2401_2500.s2470_number_of_subarrays_with_lcm_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarrayLCM() {
        assertThat(Solution().subarrayLCM(intArrayOf(3, 6, 2, 7, 1), 6), equalTo(4))
    }

    @Test
    fun subarrayLCM2() {
        assertThat(Solution().subarrayLCM(intArrayOf(3), 2), equalTo(0))
    }
}
