package g2301_2400.s2331_evaluate_boolean_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evaluateTree() {
        assertThat(
            Solution()
                .evaluateTree(TreeNode.create(listOf(2, 1, 3, null, null, 0, 1))),
            equalTo(true),
        )
    }

    @Test
    fun evaluateTree2() {
        assertThat(
            Solution().evaluateTree(TreeNode.create(listOf(0))),
            equalTo(false),
        )
    }

    @Test
    fun evaluateTree3() {
        assertThat(
            Solution()
                .evaluateTree(
                    TreeNode.create(
                        listOf(
                            3, 2, 2, 2, 2, 3, 2, 0, 0, 0, 1, 1, 2, 1, 1, null,
                            null, null, null, null, null, null, null, null,
                            null, 3, 2, null, null, null, null, 2, 3, 0, 0, 1,
                            1, 0, 3, null, null, null, null, null, null, null,
                            null, null, null, 3, 0, 3, 3, null, null, 0, 0, 1,
                            0, null, null, null, null, null, null, null,
                            null,
                        ),
                    ),
                ),
            equalTo(true),
        )
    }
}
