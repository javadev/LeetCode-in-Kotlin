package g0601_0700.s0655_print_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun printTree() {
        val treeNode = TreeNode.create(listOf(1, 2))
        val expected = listOf(listOf("", "1", ""), listOf("2", "", ""))
        assertThat(Solution().printTree(treeNode), equalTo(expected))
    }

    @Test
    fun printTree2() {
        val treeNode = TreeNode.create(listOf(1, 2, 3, null, 4))
        val expected = listOf(
            listOf("", "", "", "1", "", "", ""),
            listOf("", "2", "", "", "", "3", ""),
            listOf("", "", "4", "", "", "", "")
        )
        assertThat(Solution().printTree(treeNode), equalTo(expected))
    }
}
