package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumRootToLeaf() {
        val root: TreeNode? = TreeNode.create(listOf(1, 0, 1, 0, 1, 0, 1))
        assertThat(Solution().sumRootToLeaf(root), equalTo(22))
    }

    @Test
    fun sumRootToLeaf2() {
        val root: TreeNode? = TreeNode.create(listOf(0))
        assertThat(Solution().sumRootToLeaf(root), equalTo(0))
    }
}
