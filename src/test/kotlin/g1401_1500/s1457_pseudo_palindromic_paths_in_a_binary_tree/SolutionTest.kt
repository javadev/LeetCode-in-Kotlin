package g1401_1500.s1457_pseudo_palindromic_paths_in_a_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pseudoPalindromicPaths() {
        val root = TreeNode.create(mutableListOf(2, 3, 1, 3, 1, null, 1))
        assertThat(Solution().pseudoPalindromicPaths(root), equalTo(2))
    }

    @Test
    fun pseudoPalindromicPaths2() {
        val root = TreeNode.create(mutableListOf(2, 1, 1, 1, 3, null, null, null, null, null, 1))
        assertThat(Solution().pseudoPalindromicPaths(root), equalTo(1))
    }

    @Test
    fun pseudoPalindromicPaths3() {
        val root = TreeNode.create(mutableListOf(9))
        assertThat(Solution().pseudoPalindromicPaths(root), equalTo(1))
    }
}
