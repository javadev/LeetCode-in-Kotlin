package g0901_1000.s0987_vertical_order_traversal_of_a_binary_tree

import com_github_leetcode.ArrayUtils
import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun verticalTraversal() {
        assertThat(
            Solution()
                .verticalTraversal(
                    TreeNode.create(
                        listOf(3, 9, 20, null, null, 15, 7),
                    ),
                ),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(9), intArrayOf(3, 15), intArrayOf(20), intArrayOf(7)))),
        )
    }

    @Test
    fun verticalTraversal2() {
        assertThat(
            Solution()
                .verticalTraversal(
                    TreeNode.create(listOf(1, 2, 3, 4, 5, 6, 7)),
                ),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(4),
                        intArrayOf(2),
                        intArrayOf(1, 5, 6),
                        intArrayOf(3),
                        intArrayOf(7),
                    ),
                ),
            ),
        )
    }
}
