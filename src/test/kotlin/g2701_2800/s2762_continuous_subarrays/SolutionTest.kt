package g2701_2800.s2762_continuous_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun continuousSubarrays() {
        assertThat(Solution().continuousSubarrays(intArrayOf(5, 4, 2, 4)), equalTo(8))
    }

    @Test
    fun continuousSubarrays2() {
        assertThat(Solution().continuousSubarrays(intArrayOf(1, 2, 3)), equalTo(6))
    }
}
