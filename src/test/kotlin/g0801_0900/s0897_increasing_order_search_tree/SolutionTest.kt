package g0801_0900.s0897_increasing_order_search_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun increasingBST() {
        assertThat(
            Solution()
                .increasingBST(
                    TreeNode.create(
                        listOf(
                            5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9
                        )
                    )
                )
                .toString(),
            equalTo("1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9")
        )
    }

    @Test
    fun increasingBST2() {
        assertThat(
            Solution()
                .increasingBST(TreeNode.create(listOf(5, 1, 7)))
                .toString(),
            equalTo("1,null,5,null,7")
        )
    }
}
