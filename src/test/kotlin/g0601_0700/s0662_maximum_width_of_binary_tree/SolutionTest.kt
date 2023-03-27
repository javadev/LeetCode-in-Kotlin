package g0601_0700.s0662_maximum_width_of_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun widthOfBinaryTree() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 3, 2, 5, 3, null, 9))!!
        assertThat(Solution().widthOfBinaryTree(treeNode), equalTo(4))
    }

    @Test
    fun widthOfBinaryTree2() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 3, null, 5, 3))!!
        assertThat(Solution().widthOfBinaryTree(treeNode), equalTo(2))
    }

    @Test
    fun widthOfBinaryTree3() {
        val treeNode: TreeNode = TreeNode.create(listOf(1, 3, 2, 5))!!
        assertThat(Solution().widthOfBinaryTree(treeNode), equalTo(2))
    }
}
