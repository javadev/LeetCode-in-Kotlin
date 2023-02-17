package g0601_0700.s0687_longest_univalue_path

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestUnivaluePath() {
        val treeNode: TreeNode? = TreeNode.create(listOf(5, 4, 5, 1, 1, 5))
        assertThat(Solution().longestUnivaluePath(treeNode), equalTo(2))
    }

    @Test
    fun longestUnivaluePath2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 4, 5, 4, 4, 5))
        assertThat(Solution().longestUnivaluePath(treeNode), equalTo(2))
    }
}
