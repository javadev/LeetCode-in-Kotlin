package g1501_1600.s1504_count_submatrices_with_all_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubmat() {
        assertThat(
            Solution().numSubmat(arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            equalTo(13),
        )
    }

    @Test
    fun numSubmat2() {
        assertThat(
            Solution().numSubmat(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 0))),
            equalTo(24),
        )
    }
}
