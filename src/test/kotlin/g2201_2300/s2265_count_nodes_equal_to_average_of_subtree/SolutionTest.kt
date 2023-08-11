package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree

import com_github_leetcode.TreeUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun averageOfSubtree() {
        val root: com_github_leetcode.TreeNode = TreeUtils.constructBinaryTree(mutableListOf(4, 8, 5, 0, 1, null, 6))
        assertThat(Solution().averageOfSubtree(root), equalTo(5))
    }

    @Test
    fun averageOfSubtree2() {
        val root: com_github_leetcode.TreeNode = TreeUtils.constructBinaryTree(mutableListOf(1))
        assertThat(Solution().averageOfSubtree(root), equalTo(1))
    }
}
