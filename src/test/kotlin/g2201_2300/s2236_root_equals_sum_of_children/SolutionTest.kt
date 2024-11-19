package g2201_2300.s2236_root_equals_sum_of_children

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkTree() {
        val treeNode = TreeNode.create(mutableListOf(10, 4, 6))
        assertThat(
            Solution().checkTree(
                treeNode!!,
            ),
            equalTo(true),
        )
    }

    @Test
    fun checkTree2() {
        val treeNode = TreeNode.create(mutableListOf(5, 3, 1))
        assertThat(
            Solution().checkTree(
                treeNode!!,
            ),
            equalTo(false),
        )
    }
}
