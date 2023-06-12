package g1501_1600.s1530_number_of_good_leaf_nodes_pairs

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, 3, null, 4))
        assertThat(Solution().countPairs(treeNode, 3), equalTo(1))
    }

    @Test
    fun countPairs2() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6, 7))
        assertThat(Solution().countPairs(treeNode, 3), equalTo(2))
    }

    @Test
    fun countPairs3() {
        val treeNode = TreeNode.create(mutableListOf(7, 1, 4, 6, null, 5, 3, null, null, null, null, null, 2))
        assertThat(Solution().countPairs(treeNode, 3), equalTo(1))
    }
}
