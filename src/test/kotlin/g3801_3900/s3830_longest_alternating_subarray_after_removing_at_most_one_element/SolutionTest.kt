package g3801_3900.s3830_longest_alternating_subarray_after_removing_at_most_one_element

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestAlternating() {
        assertThat<Int>(
            Solution().longestAlternating(intArrayOf(2, 1, 3, 2)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun longestAlternating2() {
        assertThat<Int>(
            Solution().longestAlternating(intArrayOf(3, 2, 1, 2, 3, 2, 1)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun longestAlternating3() {
        assertThat<Int>(
            Solution().longestAlternating(intArrayOf(100000, 100000)),
            equalTo<Int>(1),
        )
    }
}
