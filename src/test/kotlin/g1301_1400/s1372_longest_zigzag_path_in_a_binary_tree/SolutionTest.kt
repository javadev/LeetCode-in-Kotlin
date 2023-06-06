package g1301_1400.s1372_longest_zigzag_path_in_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestZigZag() {
        val treeNode = TreeNode.create(
            mutableListOf(
                1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1,
                null, 1
            )
        )
        assertThat(Solution().longestZigZag(treeNode), equalTo(3))
    }

    @Test
    fun longestZigZag2() {
        val treeNode = TreeNode.create(mutableListOf(1, 1, 1, null, 1, null, null, 1, 1, null, 1))
        assertThat(Solution().longestZigZag(treeNode), equalTo(4))
    }

    @Test
    fun longestZigZag3() {
        val treeNode = TreeNode.create(listOf(1))
        assertThat(Solution().longestZigZag(treeNode), equalTo(0))
    }
}
