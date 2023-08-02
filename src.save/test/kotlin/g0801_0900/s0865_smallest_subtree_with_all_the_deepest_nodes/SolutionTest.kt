package g0801_0900.s0865_smallest_subtree_with_all_the_deepest_nodes

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subtreeWithAllDeepest() {
        assertThat(
            Solution()
                .subtreeWithAllDeepest(
                    TreeNode.create(
                        listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
                    )
                )
                .toString(),
            equalTo("2,7,4")
        )
    }

    @Test
    fun subtreeWithAllDeepest2() {
        assertThat(
            Solution()
                .subtreeWithAllDeepest(TreeNode.create(listOf(1)))
                .toString(),
            equalTo("1")
        )
    }

    @Test
    fun subtreeWithAllDeepest3() {
        assertThat(
            Solution()
                .subtreeWithAllDeepest(
                    TreeNode.create(listOf(0, 1, 3, null, 2))
                )
                .toString(),
            equalTo("2")
        )
    }
}
