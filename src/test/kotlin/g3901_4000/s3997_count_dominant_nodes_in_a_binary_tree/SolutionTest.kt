package g3901_4000.s3997_count_dominant_nodes_in_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDominantNodes() {
        val root = TreeNode.create(mutableListOf(5, 3, 8, 2, 4, 7, 1))
        assertThat<Int>(Solution().countDominantNodes(root), equalTo<Int>(5))
    }

    @Test
    fun countDominantNodes2() {
        val root = TreeNode.create(mutableListOf(1, 2, 3, 1, 2))
        assertThat<Int>(Solution().countDominantNodes(root), equalTo<Int>(4))
    }
}
