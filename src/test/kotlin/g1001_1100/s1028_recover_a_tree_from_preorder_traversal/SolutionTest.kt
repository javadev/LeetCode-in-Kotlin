package g1001_1100.s1028_recover_a_tree_from_preorder_traversal

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun recoverFromPreorder() {
        val expected: TreeNode? = TreeNode.create(listOf(1, 2, 5, 3, 4, 6, 7))
        assertThat(
            Solution().recoverFromPreorder("1-2--3--4-5--6--7").toString(),
            equalTo(expected.toString())
        )
    }

    @Test
    fun recoverFromPreorder2() {
        val expected: TreeNode? = TreeNode.create(listOf(1, 2, 5, 3, null, 6, null, 4, null, 7))
        assertThat(
            Solution().recoverFromPreorder("1-2--3---4-5--6---7").toString(),
            equalTo(expected.toString())
        )
    }

    @Test
    fun recoverFromPreorder3() {
        val expected: TreeNode? = TreeNode.create(listOf(1, 401, null, 349, 88, 90))
        assertThat(
            Solution().recoverFromPreorder("1-401--349---90--88").toString(),
            equalTo(expected.toString())
        )
    }
}
