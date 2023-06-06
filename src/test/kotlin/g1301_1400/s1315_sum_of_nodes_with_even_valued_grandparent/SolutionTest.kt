package g1301_1400.s1315_sum_of_nodes_with_even_valued_grandparent

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumEvenGrandparent() {
        val root = TreeNode.create(mutableListOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
        assertThat(Solution().sumEvenGrandparent(root), equalTo(18))
    }

    @Test
    fun sumEvenGrandparent2() {
        val root = TreeNode.create(listOf(1))
        assertThat(Solution().sumEvenGrandparent(root), equalTo(0))
    }
}
