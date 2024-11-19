package g0201_0300.s0257_binary_tree_paths

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun binaryTreePaths() {
        val treeNode = TreeNode(1, TreeNode(2, null, TreeNode(5)), TreeNode(3))
        assertThat(
            Solution().binaryTreePaths(treeNode),
            equalTo(listOf("1->2->5", "1->3")),
        )
    }

    @Test
    fun binaryTreePaths2() {
        val treeNode = TreeNode(1)
        assertThat(Solution().binaryTreePaths(treeNode), equalTo(listOf("1")))
    }
}
