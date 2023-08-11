package g0701_0800.s0783_minimum_distance_between_bst_nodes

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDiffInBST() {
        assertThat(
            Solution()
                .minDiffInBST(
                    TreeNode.create(
                        listOf(4, 2, 6, 1, 3, null, null)
                    )
                ),
            equalTo(1)
        )
    }

    @Test
    fun minDiffInBST2() {
        assertThat(
            Solution()
                .minDiffInBST(
                    TreeNode.create(
                        listOf(1, 0, 48, null, null, 12, 49)
                    )
                ),
            equalTo(1)
        )
    }
}
