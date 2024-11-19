package g0201_0300.s0209_minimum_size_subarray_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSubArrayLen() {
        assertThat(Solution().minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)), equalTo(2))
    }

    @Test
    fun minSubArrayLen2() {
        assertThat(Solution().minSubArrayLen(4, intArrayOf(1, 4, 4)), equalTo(1))
    }

    @Test
    fun minSubArrayLen3() {
        assertThat(
            Solution().minSubArrayLen(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)),
            equalTo(0),
        )
    }
}
