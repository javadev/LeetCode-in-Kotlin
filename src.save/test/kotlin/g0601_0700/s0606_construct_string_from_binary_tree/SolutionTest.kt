package g0601_0700.s0606_construct_string_from_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tree2str() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 2, 3, 4))
        assertThat(Solution().tree2str(treeNode), equalTo("1(2(4))(3)"))
    }

    @Test
    fun tree2str2() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 2, 3, null, 4))
        assertThat(Solution().tree2str(treeNode), equalTo("1(2()(4))(3)"))
    }
}
