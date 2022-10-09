package g0101_0200.s0144_binary_tree_preorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun preorderTraversal() {
        val treeNode = TreeNode(1)
        treeNode.right = TreeNode(2)
        treeNode.right!!.left = TreeNode(3)
        assertThat(Solution().preorderTraversal(treeNode), equalTo(Arrays.asList(1, 2, 3)))
    }

    @Test
    fun preorderTraversal2() {
        assertThat(Solution().preorderTraversal(null), equalTo(emptyList()))
    }

    @Test
    fun preorderTraversal3() {
        assertThat(
            Solution().preorderTraversal(TreeNode(1)),
            equalTo(listOf(1))
        )
    }
}
