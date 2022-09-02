package g0101_0200.s0101_symmetric_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSymmetric() {
        assertThat(Solution().isSymmetric(TreeNode.create(listOf(1, 2, 2, 3, 4, 4, 3))), equalTo(true))
    }

    @Test
    fun isSymmetric2() {
        assertThat(Solution().isSymmetric(TreeNode.create(listOf(1, 2, 2, null, 3, null, 3))), equalTo(false))
    }
}
