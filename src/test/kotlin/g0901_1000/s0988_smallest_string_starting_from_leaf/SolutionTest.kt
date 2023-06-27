package g0901_1000.s0988_smallest_string_starting_from_leaf

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestFromLeaf() {
        assertThat(
            Solution()
                .smallestFromLeaf(
                    TreeNode.create(listOf(0, 1, 2, 3, 4, 3, 4))
                ),
            equalTo("dba")
        )
    }

    @Test
    fun smallestFromLeaf2() {
        assertThat(
            Solution()
                .smallestFromLeaf(
                    TreeNode.create(listOf(25, 1, 3, 1, 3, 0, 2))
                ),
            equalTo("adz")
        )
    }

    @Test
    fun smallestFromLeaf3() {
        assertThat(
            Solution()
                .smallestFromLeaf(
                    TreeNode.create(
                        listOf(2, 2, 1, null, 1, 0, null, 0)
                    )
                ),
            equalTo("abc")
        )
    }
}
