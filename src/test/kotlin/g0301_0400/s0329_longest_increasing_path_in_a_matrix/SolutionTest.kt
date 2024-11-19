package g0301_0400.s0329_longest_increasing_path_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestIncreasingPath() {
        assertThat(
            Solution().longestIncreasingPath(arrayOf(intArrayOf(9, 9, 4), intArrayOf(6, 6, 8), intArrayOf(2, 1, 1))),
            equalTo(4),
        )
    }

    @Test
    fun longestIncreasingPath2() {
        assertThat(
            Solution().longestIncreasingPath(arrayOf(intArrayOf(3, 4, 5), intArrayOf(3, 2, 6), intArrayOf(2, 2, 1))),
            equalTo(4),
        )
    }
}
