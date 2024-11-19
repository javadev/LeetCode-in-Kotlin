package g2401_2500.s2411_smallest_subarrays_with_maximum_bitwise_or

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestSubarrays() {
        assertThat(
            Solution().smallestSubarrays(intArrayOf(1, 0, 2, 1, 3)),
            equalTo(intArrayOf(3, 3, 2, 2, 1)),
        )
    }

    @Test
    fun smallestSubarrays2() {
        assertThat(Solution().smallestSubarrays(intArrayOf(1, 2)), equalTo(intArrayOf(2, 1)))
    }
}
