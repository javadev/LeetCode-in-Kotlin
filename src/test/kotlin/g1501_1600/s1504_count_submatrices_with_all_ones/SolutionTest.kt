package g1501_1600.s1504_count_submatrices_with_all_ones

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubmat() {
        MatcherAssert.assertThat(
            Solution().numSubmat(arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            CoreMatchers.equalTo(13)
        )
    }

    @Test
    fun numSubmat2() {
        MatcherAssert.assertThat(
            Solution().numSubmat(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 0))),
            CoreMatchers.equalTo(24)
        )
    }
}
