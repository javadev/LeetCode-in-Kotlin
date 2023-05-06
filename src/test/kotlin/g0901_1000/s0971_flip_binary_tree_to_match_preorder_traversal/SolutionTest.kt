package g0901_1000.s0971_flip_binary_tree_to_match_preorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flipMatchVoyage() {
        assertThat(
            Solution()
                .flipMatchVoyage(TreeNode.create(listOf(1, 2)), intArrayOf(2, 1)),
            equalTo(listOf(-1))
        )
    }

    @Test
    fun flipMatchVoyage2() {
        assertThat(
            Solution()
                .flipMatchVoyage(
                    TreeNode.create(listOf(1, 2, 3)), intArrayOf(1, 3, 2)
                ),
            equalTo(listOf(1))
        )
    }

    @Test
    fun flipMatchVoyage3() {
        assertThat(
            Solution()
                .flipMatchVoyage(
                    TreeNode.create(listOf(1, 2, 3)), intArrayOf(1, 2, 3)
                ),
            equalTo(emptyList())
        )
    }
}
