package g1301_1400.s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun targetCopy() {
        val original = TreeNode.create(mutableListOf(7, 4, 3, null, null, 6, 19))
        val cloned = TreeNode.create(mutableListOf(7, 4, 3, null, null, 6, 19))
        val target = TreeNode.create(mutableListOf(3, 6, 19))
        assertThat(
            Solution().getTargetCopy(original, cloned, target!!).toString(),
            equalTo("3,6,19"),
        )
    }

    @Test
    fun targetCopy2() {
        val original = TreeNode.create(mutableListOf(7))
        val cloned = TreeNode.create(mutableListOf(7))
        val target = TreeNode.create(mutableListOf(7))
        assertThat(
            Solution().getTargetCopy(original, cloned, target!!).toString(),
            equalTo("7"),
        )
    }

    @Test
    fun targetCopy3() {
        val original = TreeNode.create(mutableListOf(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1))
        val cloned = TreeNode.create(mutableListOf(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1))
        val target = TreeNode.create(mutableListOf(4, null, 3, null, 2, null, 1))
        assertThat(
            Solution().getTargetCopy(original, cloned, target!!).toString(),
            equalTo("4,null,3,null,2,null,1"),
        )
    }

    @Test
    fun targetCopy4() {
        val original = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        val cloned = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        val target = TreeNode.create(mutableListOf(5, 10))
        assertThat(
            Solution().getTargetCopy(original, cloned, target!!).toString(),
            equalTo("5,10,null"),
        )
    }

    @Test
    fun targetCopy5() {
        val original = TreeNode.create(mutableListOf(1, 2, null, 3))
        val cloned = TreeNode.create(mutableListOf(1, 2, null, 3))
        val target = TreeNode.create(mutableListOf(2, 3))
        assertThat(
            Solution().getTargetCopy(original, cloned, target!!).toString(),
            equalTo("2,3,null"),
        )
    }
}
