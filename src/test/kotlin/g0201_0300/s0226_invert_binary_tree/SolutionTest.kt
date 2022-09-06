package g0201_0300.s0226_invert_binary_tree

import com_github_leetcode.TreeNode
import com_github_leetcode.TreeUtils
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun invertTree() {
        val root: TreeNode = TreeUtils.constructBinaryTree(listOf(4, 2, 7, 1, 3, 6, 9))
        MatcherAssert.assertThat(Solution().invertTree(root).toString(), CoreMatchers.equalTo("4,7,9,6,2,3,1"))
    }

    @Test
    fun invertTree2() {
        val root: TreeNode = TreeUtils.constructBinaryTree(listOf(2, 1, 3))
        MatcherAssert.assertThat(Solution().invertTree(root).toString(), CoreMatchers.equalTo("2,3,1"))
    }
}
