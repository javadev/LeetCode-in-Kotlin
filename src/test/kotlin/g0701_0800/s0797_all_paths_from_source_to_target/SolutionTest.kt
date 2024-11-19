package g0701_0800.s0797_all_paths_from_source_to_target

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun allPathsSourceTarget() {
        assertThat(
            Solution().allPathsSourceTarget(arrayOf(intArrayOf(1, 2), intArrayOf(3), intArrayOf(3), intArrayOf())),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(0, 1, 3), intArrayOf(0, 2, 3)))),
        )
    }

    @Test
    fun allPathsSourceTarget2() {
        assertThat(
            Solution()
                .allPathsSourceTarget(
                    arrayOf(
                        intArrayOf(4, 3, 1),
                        intArrayOf(3, 2, 4),
                        intArrayOf(3),
                        intArrayOf(4),
                        intArrayOf(),
                    ),
                ),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 4),
                        intArrayOf(0, 3, 4),
                        intArrayOf(0, 1, 3, 4),
                        intArrayOf(0, 1, 2, 3, 4),
                        intArrayOf(0, 1, 4),
                    ),
                ),
            ),
        )
    }
}
