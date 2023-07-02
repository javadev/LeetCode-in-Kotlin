package g2301_2400.s2382_maximum_segment_sum_after_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSegmentSum() {
        assertThat(
            Solution()
                .maximumSegmentSum(intArrayOf(1, 2, 5, 6, 1), intArrayOf(0, 3, 2, 4, 1)),
            equalTo(longArrayOf(14, 7, 2, 2, 0))
        )
    }

    @Test
    fun maximumSegmentSum2() {
        assertThat(
            Solution().maximumSegmentSum(intArrayOf(3, 2, 11, 1), intArrayOf(3, 2, 1, 0)),
            equalTo(longArrayOf(16, 5, 3, 0))
        )
    }
}
