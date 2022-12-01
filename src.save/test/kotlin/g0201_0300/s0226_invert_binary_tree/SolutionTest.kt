package g0201_0300.s0226_invert_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun invertTree() {
        val root: TreeNode? = TreeNode.create(listOf(4, 2, 7, 1, 3, 6, 9))
        assertThat(Solution().invertTree(root).toString(), equalTo("4,7,9,6,2,3,1"))
    }

    @Test
    fun invertTree2() {
        val root: TreeNode? = TreeNode.create(listOf(2, 1, 3))
        assertThat(Solution().invertTree(root).toString(), equalTo("2,3,1"))
    }
}
