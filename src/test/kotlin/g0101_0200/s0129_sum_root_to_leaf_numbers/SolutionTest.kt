package g0101_0200.s0129_sum_root_to_leaf_numbers

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun sumNumbers() {
        val treeNode: TreeNode? = TreeNode.create(Arrays.asList(1, 2, 3))
        assertThat(Solution().sumNumbers(treeNode!!), equalTo(25))
    }

    @Test
    fun sumNumbers2() {
        val treeNode: TreeNode? = TreeNode.create(Arrays.asList(4, 9, 0, 5, 1))
        assertThat(Solution().sumNumbers(treeNode!!), equalTo(1026))
    }
}
