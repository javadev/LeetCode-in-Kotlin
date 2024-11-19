package g0901_1000.s0980_unique_paths_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniquePathsIII() {
        assertThat(
            Solution()
                .uniquePathsIII(arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 2, -1))),
            equalTo(2),
        )
    }

    @Test
    fun uniquePathsIII2() {
        assertThat(
            Solution()
                .uniquePathsIII(arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 2))),
            equalTo(4),
        )
    }

    @Test
    fun uniquePathsIII3() {
        assertThat(Solution().uniquePathsIII(arrayOf(intArrayOf(0, 1), intArrayOf(2, 0))), equalTo(0))
    }
}
