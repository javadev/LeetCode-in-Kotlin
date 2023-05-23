package g1001_1100.s1026_maximum_difference_between_node_and_ancestor

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAncestorDiff() {
        val treeNode: TreeNode? = TreeNode.create(listOf(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13))
        assertThat(Solution().maxAncestorDiff(treeNode), equalTo(7))
    }

    @Test
    fun maxAncestorDiff2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, null, 2, null, 0, 3))
        assertThat(Solution().maxAncestorDiff(treeNode), equalTo(3))
    }
}
