package g1301_1400.s1382_balance_a_binary_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun balanceBST() {
        assertThat(
            Solution()
                .balanceBST(
                    TreeNode.create(mutableListOf(1, null, 2, null, 3, null, 4, null, null))
                )
                .toString(),
            equalTo("2,1,3,null,4")
        )
    }

    @Test
    fun balanceBST2() {
        assertThat(
            Solution().balanceBST(TreeNode.create(mutableListOf(2, 1, 3))).toString(),
            equalTo("2,1,3")
        )
    }
}
