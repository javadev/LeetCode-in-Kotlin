package g0701_0800.s0795_number_of_subarrays_with_bounded_maximum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubarrayBoundedMax() {
        assertThat(Solution().numSubarrayBoundedMax(intArrayOf(2, 1, 4, 3), 2, 3), equalTo(3))
    }

    @Test
    fun numSubarrayBoundedMax2() {
        assertThat(
            Solution().numSubarrayBoundedMax(intArrayOf(2, 9, 2, 5, 6), 2, 8), equalTo(7)
        )
    }
}
