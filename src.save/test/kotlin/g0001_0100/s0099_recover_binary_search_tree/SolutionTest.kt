package g0001_0100.s0099_recover_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun recoverTree() {
        val treeNode = TreeNode(1)
        treeNode.left = TreeNode(3)
        treeNode.left!!.right = TreeNode(2)
        Solution().recoverTree(treeNode)
        assertThat(treeNode.toString(), equalTo("3,1,null,2,null"))
    }

    @Test
    fun recoverTree2() {
        val treeNode = TreeNode(3)
        treeNode.left = TreeNode(1)
        treeNode.right = TreeNode(4)
        treeNode.right!!.left = TreeNode(2)
        Solution().recoverTree(treeNode)
        assertThat(treeNode.toString(), equalTo("2,1,4,3,null"))
    }
}
