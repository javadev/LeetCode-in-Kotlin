package g1601_1700.s1609_even_odd_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isEvenOddTree() {
        val treeNode = TreeNode.create(listOf(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2))
        MatcherAssert.assertThat(Solution().isEvenOddTree(treeNode), CoreMatchers.equalTo(true))
    }

    @Test
    fun isEvenOddTree2() {
        val treeNode = TreeNode.create(listOf(5, 4, 2, 3, 3, 7))
        MatcherAssert.assertThat(Solution().isEvenOddTree(treeNode), CoreMatchers.equalTo(false))
    }

    @Test
    fun isEvenOddTree3() {
        val treeNode = TreeNode.create(listOf(5, 9, 1, 3, 5, 7))
        MatcherAssert.assertThat(Solution().isEvenOddTree(treeNode), CoreMatchers.equalTo(false))
    }
}
