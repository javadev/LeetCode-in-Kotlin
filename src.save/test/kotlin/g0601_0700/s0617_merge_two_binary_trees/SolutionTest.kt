package g0601_0700.s0617_merge_two_binary_trees

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeTrees() {
        val root1: TreeNode? = TreeNode.create(listOf(1, 3, 2, 5))
        val root2: TreeNode? = TreeNode.create(listOf(2, 1, 3, null, 4, null, 7))
        assertThat(Solution().mergeTrees(root1, root2).toString(), equalTo("3,4,5,4,5,null,7"))
    }

    @Test
    fun mergeTrees2() {
        val root1: TreeNode? = TreeNode.create(listOf(1))
        val root2: TreeNode? = TreeNode.create(listOf(1, 2))
        assertThat(Solution().mergeTrees(root1, root2).toString(), equalTo("2,2,null"))
    }
}
