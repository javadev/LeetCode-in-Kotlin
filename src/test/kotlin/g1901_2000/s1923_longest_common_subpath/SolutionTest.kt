package g1901_2000.s1923_longest_common_subpath

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonSubpath() {
        assertThat(
            Solution()
                .longestCommonSubpath(
                    5,
                    arrayOf(intArrayOf(0, 1, 2, 3, 4), intArrayOf(2, 3, 4), intArrayOf(4, 0, 1, 2, 3)),
                ),
            equalTo(2),
        )
    }

    @Test
    fun longestCommonSubpath2() {
        assertThat(Solution().longestCommonSubpath(5, arrayOf(intArrayOf(0), intArrayOf(1), intArrayOf(2))), equalTo(0))
    }

    @Test
    fun longestCommonSubpath3() {
        assertThat(
            Solution()
                .longestCommonSubpath(5, arrayOf(intArrayOf(0, 1, 2, 3, 4), intArrayOf(4, 3, 2, 1, 0))),
            equalTo(1),
        )
    }
}
