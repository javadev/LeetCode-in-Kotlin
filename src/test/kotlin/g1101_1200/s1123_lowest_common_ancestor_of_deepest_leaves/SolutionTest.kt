package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lcaDeepestLeaves() {
        assertThat(
            Solution()
                .lcaDeepestLeaves(
                    TreeNode.create(mutableListOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)),
                )
                .toString(),
            equalTo("2,7,4"),
        )
    }

    @Test
    fun lcaDeepestLeaves2() {
        assertThat(
            Solution().lcaDeepestLeaves(TreeNode.create(mutableListOf(1))).toString(),
            equalTo("1"),
        )
    }

    @Test
    fun lcaDeepestLeaves3() {
        assertThat(
            Solution()
                .lcaDeepestLeaves(TreeNode.create(mutableListOf(0, 1, 3, null, 2)))
                .toString(),
            equalTo("2"),
        )
    }
}
