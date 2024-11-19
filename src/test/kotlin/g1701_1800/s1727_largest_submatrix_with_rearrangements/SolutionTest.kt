package g1701_1800.s1727_largest_submatrix_with_rearrangements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestSubmatrix() {
        assertThat(
            Solution().largestSubmatrix(arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 1, 1), intArrayOf(1, 0, 1))),
            equalTo(4),
        )
    }

    @Test
    fun largestSubmatrix2() {
        assertThat(Solution().largestSubmatrix(arrayOf(intArrayOf(1, 0, 1, 0, 1))), equalTo(3))
    }

    @Test
    fun largestSubmatrix3() {
        assertThat(Solution().largestSubmatrix(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))), equalTo(2))
    }
}
