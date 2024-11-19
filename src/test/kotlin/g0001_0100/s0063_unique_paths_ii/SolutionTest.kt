package g0001_0100.s0063_unique_paths_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniquePathsWithObstacles() {
        assertThat(
            Solution()
                .uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))),
            equalTo(2),
        )
    }

    @Test
    fun uniquePathsWithObstacles2() {
        assertThat(
            Solution().uniquePathsWithObstacles(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))),
            equalTo(1),
        )
    }
}
