package g0001_0100.s0100_same_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSameTree() {
        val p: TreeNode = TreeNode.create(arrayListOf(1, 2, 3))!!
        val q: TreeNode = TreeNode.create(arrayListOf(1, 2, 3))!!
        assertThat(Solution().isSameTree(p, q), equalTo(true))
    }

    @Test
    fun isSameTree2() {
        val p: TreeNode = TreeNode.create(arrayListOf(1, 2))!!
        val q: TreeNode = TreeNode.create(arrayListOf(1, null, 3))!!
        assertThat(Solution().isSameTree(p, q), equalTo(false))
    }

    @Test
    fun isSameTree3() {
        val p: TreeNode = TreeNode.create(arrayListOf(1, 2, 1))!!
        val q: TreeNode = TreeNode.create(arrayListOf(1, 1, 2))!!
        assertThat(Solution().isSameTree(p, q), equalTo(false))
    }
}
