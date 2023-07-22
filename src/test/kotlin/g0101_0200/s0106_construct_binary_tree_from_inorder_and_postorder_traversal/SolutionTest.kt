package g0101_0200.s0106_construct_binary_tree_from_inorder_and_postorder_traversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructBinaryTree() {
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val postorder = intArrayOf(9, 15, 7, 20, 3)
        val actual = Solution().buildTree(inorder, postorder)
        assertThat(actual.toString(), equalTo("3,9,20,15,7"))
    }

    @Test
    fun constructBinaryTree2() {
        val inorder = intArrayOf(-1)
        val postorder = intArrayOf(-1)
        val actual = Solution().buildTree(inorder, postorder)
        assertThat(actual.toString(), equalTo("-1"))
    }
}
