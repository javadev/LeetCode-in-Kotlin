package g0601_0700.s0643_maximum_average_subarray_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxAverage() {
        assertThat(
            Solution().findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4),
            equalTo(12.75000)
        )
    }

    @Test
    fun findMaxAverage2() {
        assertThat(Solution().findMaxAverage(intArrayOf(5), 1), equalTo(5.00000))
    }
}
