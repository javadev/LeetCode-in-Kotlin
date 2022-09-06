package g0201_0300.s0230_kth_smallest_element_in_a_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallest() {
        val root = TreeNode.create(listOf(3, 1, 4, null, 2))
        MatcherAssert.assertThat(Solution().kthSmallest(root, 1), CoreMatchers.equalTo(1))
    }

    @Test
    fun kthSmallest2() {
        val root = TreeNode.create(listOf(5, 3, 6, 2, 4, null, null, 1))
        MatcherAssert.assertThat(Solution().kthSmallest(root, 3), CoreMatchers.equalTo(3))
    }
}
