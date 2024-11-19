package g1301_1400.s1361_validate_binary_tree_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validateBinaryTreeNodes() {
        assertThat(
            Solution()
                .validateBinaryTreeNodes(
                    4,
                    intArrayOf(1, -1, 3, -1),
                    intArrayOf(2, -1, -1, -1),
                ),
            equalTo(true),
        )
    }

    @Test
    fun validateBinaryTreeNodes2() {
        assertThat(
            Solution()
                .validateBinaryTreeNodes(
                    4,
                    intArrayOf(1, -1, 3, -1),
                    intArrayOf(2, 3, -1, -1),
                ),
            equalTo(false),
        )
    }

    @Test
    fun validateBinaryTreeNodes3() {
        assertThat(
            Solution().validateBinaryTreeNodes(2, intArrayOf(1, 0), intArrayOf(-1, -1)),
            equalTo(false),
        )
    }
}
