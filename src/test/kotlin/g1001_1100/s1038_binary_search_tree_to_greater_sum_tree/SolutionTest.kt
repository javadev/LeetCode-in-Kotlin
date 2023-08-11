package g1001_1100.s1038_binary_search_tree_to_greater_sum_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bstToGst() {
        val root: TreeNode? = TreeNode.create(
            listOf(
                4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8
            )
        )
        val expected: TreeNode? = TreeNode.create(
            listOf(
                30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null,
                8
            )
        )
        assertThat(Solution().bstToGst(root).toString(), equalTo(expected.toString()))
    }

    @Test
    fun bstToGst2() {
        val root: TreeNode? = TreeNode.create(listOf(0, null, 1))
        val expected: TreeNode? = TreeNode.create(listOf(1, null, 1))
        assertThat(Solution().bstToGst(root).toString(), equalTo(expected.toString()))
    }
}
