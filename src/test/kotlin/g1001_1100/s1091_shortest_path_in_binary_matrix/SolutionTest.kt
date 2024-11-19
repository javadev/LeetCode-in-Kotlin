package g1001_1100.s1091_shortest_path_in_binary_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPathBinaryMatrix() {
        assertThat(
            Solution().shortestPathBinaryMatrix(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))),
            equalTo(2),
        )
    }

    @Test
    fun shortestPathBinaryMatrix2() {
        assertThat(
            Solution()
                .shortestPathBinaryMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            equalTo(4),
        )
    }

    @Test
    fun shortestPathBinaryMatrix3() {
        assertThat(
            Solution()
                .shortestPathBinaryMatrix(arrayOf(intArrayOf(1, 0, 0), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            equalTo(-1),
        )
    }
}
