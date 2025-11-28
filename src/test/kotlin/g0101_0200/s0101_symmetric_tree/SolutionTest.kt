package g0101_0200.s0101_symmetric_tree

import com_github_leetcode.TreeNode
import com_github_leetcode.TreeUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSymmetric() {
        assertThat(Solution().isSymmetric(TreeNode.create(listOf(1, 2, 2, 3, 4, 4, 3))), equalTo(true))
    }

    @Test
    fun isSymmetric2() {
        assertThat(Solution().isSymmetric(TreeNode.create(listOf(1, 2, 2, null, 3, null, 3))), equalTo(false))
    }

    @Test
    fun isSymmetric3() {
        assertThat(Solution().isSymmetric(null), equalTo(true))
    }

    @Test
    fun isSymmetric4() {
        assertThat(Solution().isSymmetric(TreeNode.create(listOf(1, 2, 2, 3, 4, 4, 5))), equalTo(false))
    }

    @Test
    fun symmetricTree3() {
        assertThat(Solution().isSymmetric(null), equalTo(true))
    }

    @Test
    fun symmetricTree4() {
        val root = TreeNode(1)
        assertThat(Solution().isSymmetric(root), equalTo(true))
    }

    @Test
    fun symmetricTree5() {
        val root = TreeNode(1, TreeNode(2), null)
        assertThat(Solution().isSymmetric(root), equalTo(false))
    }

    @Test
    fun symmetricTree6() {
        val root = TreeNode(1, null, TreeNode(2))
        assertThat(Solution().isSymmetric(root), equalTo(false))
    }

    @Test
    fun symmetricTree7() {
        val root = TreeUtils.constructBinaryTree(listOf(1, 2, 2, 3, 4, 5, 3))
        assertThat(Solution().isSymmetric(root), equalTo(false))
    }
}
