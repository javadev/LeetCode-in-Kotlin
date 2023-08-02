package g2401_2500.s2458_height_of_binary_tree_after_subtree_removal_queries

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun treeQueries() {
        assertThat(
            Solution()
                .treeQueries(
                    TreeNode.create(
                        mutableListOf(
                            1, 3, 4, 2, null, 6, 5, null, null, null, null,
                            null, 7
                        )
                    ),
                    intArrayOf(4)
                ),
            equalTo(intArrayOf(2))
        )
    }

    @Test
    fun treeQueries2() {
        assertThat(
            Solution()
                .treeQueries(
                    TreeNode.create(mutableListOf(5, 8, 9, 2, 1, 3, 7, 4, 6)), intArrayOf(3, 2, 4, 8)
                ),
            equalTo(intArrayOf(3, 2, 3, 2))
        )
    }
}
