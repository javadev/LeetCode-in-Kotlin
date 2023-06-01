package g0901_1000.s0968_binary_tree_cameras

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCameraCover() {
        assertThat(
            Solution().minCameraCover(TreeNode.create(listOf(0, 0, null, 0, 0))),
            equalTo(1)
        )
    }

    @Test
    fun minCameraCover2() {
        assertThat(
            Solution()
                .minCameraCover(
                    TreeNode.create(
                        listOf(0, 0, null, 0, null, 0, null, null, 0)
                    )
                ),
            equalTo(2)
        )
    }
}
