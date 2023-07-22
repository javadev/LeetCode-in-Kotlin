package g0201_0300.s0230_kth_smallest_element_in_a_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallest() {
        val root: TreeNode? = TreeNode.create(listOf(3, 1, 4, null, 2))
        assertThat(Solution().kthSmallest(root!!, 1), equalTo(1))
    }

    @Test
    fun kthSmallest2() {
        val root: TreeNode? = TreeNode.create(listOf(5, 3, 6, 2, 4, null, null, 1))
        assertThat(Solution().kthSmallest(root!!, 3), equalTo(3))
    }
}
