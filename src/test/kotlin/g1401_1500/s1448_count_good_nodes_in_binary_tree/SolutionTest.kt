package g1401_1500.s1448_count_good_nodes_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodNodes() {
        val root = TreeNode.create(mutableListOf(3, 1, 4, 3, null, 1, 5))
        assertThat(Solution().goodNodes(root), equalTo(4))
    }

    @Test
    fun goodNodes2() {
        val root = TreeNode.create(mutableListOf(3, 3, null, 4, 2))
        assertThat(Solution().goodNodes(root), equalTo(3))
    }

    @Test
    fun goodNodes3() {
        val root = TreeNode.create(listOf(1))
        assertThat(Solution().goodNodes(root), equalTo(1))
    }
}
