package g2401_2500.s2471_minimum_number_of_operations_to_sort_a_binary_tree_by_level

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(
            Solution()
                .minimumOperations(
                    TreeNode.create(
                        mutableListOf(
                            1, 4, 3, 7, 6, 8, 5, null, null, null, null, 9,
                            null, 10,
                        ),
                    )!!,
                ),
            equalTo(3),
        )
    }

    @Test
    fun minimumOperations2() {
        assertThat(
            Solution()
                .minimumOperations(TreeNode.create(mutableListOf(1, 3, 2, 7, 6, 5, 4))!!),
            equalTo(3),
        )
    }

    @Test
    fun minimumOperations3() {
        assertThat(
            Solution().minimumOperations(
                TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6))!!,
            ),
            equalTo(0),
        )
    }
}
