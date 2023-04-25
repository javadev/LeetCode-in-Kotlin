package g0801_0900.s0872_leaf_similar_trees

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leafSimilar() {
        val root1: TreeNode? = TreeNode.create(listOf(3, 5, 6, 2, 7, 4, 1, 9, 8))
        val root2: TreeNode? = TreeNode.create(listOf(3, 5, 6, 2, 7, 4, 1, 9, 8))
        assertThat(Solution().leafSimilar(root1, root2), equalTo(true))
    }

    @Test
    fun leafSimilar2() {
        val root1: TreeNode? = TreeNode.create(listOf(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4))
        val root2: TreeNode? = TreeNode.create(
            listOf(
                3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8
            )
        )
        assertThat(Solution().leafSimilar(root1, root2), equalTo(true))
    }

    @Test
    fun leafSimilar3() {
        val root1: TreeNode? = TreeNode.create(listOf(1, 2, 3))
        val root2: TreeNode? = TreeNode.create(listOf(1, 3, 2))
        assertThat(Solution().leafSimilar(root1, root2), equalTo(false))
    }
}
