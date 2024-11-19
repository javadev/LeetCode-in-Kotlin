package g1001_1100.s1008_construct_binary_search_tree_from_preorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bstFromPreorder() {
        assertThat(
            Solution().bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12)).toString(),
            equalTo(TreeNode.create(listOf(8, 5, 10, 1, 7, null, 12)).toString()),
        )
    }

    @Test
    fun bstFromPreorder2() {
        assertThat(
            Solution().bstFromPreorder(intArrayOf(1, 3)).toString(),
            equalTo(TreeNode.create(listOf(1, null, 3)).toString()),
        )
    }
}
