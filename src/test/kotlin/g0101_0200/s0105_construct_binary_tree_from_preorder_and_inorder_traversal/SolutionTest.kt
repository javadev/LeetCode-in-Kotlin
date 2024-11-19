package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buildTree() {
        assertThat(
            Solution().buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)).toString(),
            equalTo(
                TreeNode.create(
                    listOf(3, 9, 20, null, null, 15, 7),
                ).toString(),
            ),
        )
    }

    @Test
    fun buildTree2() {
        assertThat(
            Solution().buildTree(intArrayOf(-1), intArrayOf(-1)).toString(),
            equalTo(
                TreeNode.create(
                    listOf(-1),
                ).toString(),
            ),
        )
    }
}
