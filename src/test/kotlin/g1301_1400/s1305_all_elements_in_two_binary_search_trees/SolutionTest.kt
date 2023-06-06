package g1301_1400.s1305_all_elements_in_two_binary_search_trees

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun allElements() {
        assertThat(
            Solution()
                .getAllElements(
                    TreeNode.create(mutableListOf(2, 1, 4))!!,
                    TreeNode.create(mutableListOf(1, 0, 3))!!
                ),
            equalTo(mutableListOf(0, 1, 1, 2, 3, 4))
        )
    }

    @Test
    fun allElements2() {
        assertThat(
            Solution()
                .getAllElements(
                    TreeNode.create(mutableListOf(1, null, 8))!!,
                    TreeNode.create(mutableListOf(8, 1))!!
                ),
            equalTo(mutableListOf(1, 1, 8, 8))
        )
    }
}
