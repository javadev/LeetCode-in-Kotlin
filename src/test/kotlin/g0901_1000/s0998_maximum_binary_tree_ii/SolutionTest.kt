package g0901_1000.s0998_maximum_binary_tree_ii

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun insertIntoMaxTree() {
        assertThat(
            Solution()
                .insertIntoMaxTree(
                    TreeNode.create(
                        listOf(4, 1, 3, null, null, 2)
                    ),
                    5
                )
                .toString(),
            equalTo("5,4,1,3,2,null,null")
        )
    }

    @Test
    fun insertIntoMaxTree2() {
        assertThat(
            Solution()
                .insertIntoMaxTree(
                    TreeNode.create(listOf(5, 2, 4, null, 1)), 3
                )
                .toString(),
            equalTo("5,2,null,1,4,null,3")
        )
    }

    @Test
    fun insertIntoMaxTree3() {
        assertThat(
            Solution()
                .insertIntoMaxTree(
                    TreeNode.create(listOf(5, 2, 3, null, 1)), 4
                )
                .toString(),
            equalTo("5,2,null,1,4,3,null")
        )
    }
}
