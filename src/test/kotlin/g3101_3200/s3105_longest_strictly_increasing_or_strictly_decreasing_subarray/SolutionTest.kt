package g3101_3200.s3105_longest_strictly_increasing_or_strictly_decreasing_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestMonotonicSubarray() {
        assertThat(
            Solution().longestMonotonicSubarray(intArrayOf(1, 4, 3, 3, 2)),
            equalTo(2),
        )
    }

    @Test
    fun longestMonotonicSubarray2() {
        assertThat(Solution().longestMonotonicSubarray(intArrayOf(3, 3, 3, 3)), equalTo(1))
    }
}
