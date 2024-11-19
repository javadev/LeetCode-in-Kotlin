package g0901_1000.s0951_flip_equivalent_binary_trees

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flipEquiv() {
        val root1: TreeNode? = TreeNode.create(
            listOf(1, 2, 3, 4, 5, 6, null, null, null, 7, 8),
        )
        val root2: TreeNode? = TreeNode.create(
            listOf(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7),
        )
        assertThat(Solution().flipEquiv(root1, root2), equalTo(true))
    }

    @Test
    fun flipEquiv2() {
        val root1: TreeNode? = TreeNode.create(listOf(1, 2, 3))
        val root2: TreeNode? = TreeNode.create(listOf(1, 2, 4))
        assertThat(Solution().flipEquiv(root1, root2), equalTo(false))
    }
}
