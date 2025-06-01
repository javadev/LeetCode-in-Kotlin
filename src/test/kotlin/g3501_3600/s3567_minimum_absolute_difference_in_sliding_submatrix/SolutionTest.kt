package g3501_3600.s3567_minimum_absolute_difference_in_sliding_submatrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAbsDiff() {
        assertThat<Array<IntArray>>(
            Solution().minAbsDiff(arrayOf<IntArray>(intArrayOf(1, 8), intArrayOf(3, -2)), 2),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(2))),
        )
    }

    @Test
    fun minAbsDiff2() {
        assertThat<Array<IntArray>>(
            Solution().minAbsDiff(arrayOf<IntArray>(intArrayOf(3, -1)), 1),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(0, 0))),
        )
    }

    @Test
    fun minAbsDiff3() {
        assertThat<Array<IntArray>>(
            Solution().minAbsDiff(arrayOf<IntArray>(intArrayOf(1, -2, 3), intArrayOf(2, 3, 5)), 2),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(1, 2))),
        )
    }
}
