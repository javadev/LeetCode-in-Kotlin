package g0101_0200.s0113_path_sum_ii

import com_github_leetcode.ArrayUtils.getLists
import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathSum() {
        val root: TreeNode? = TreeNode.create(
            listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1),
        )
        assertThat(
            Solution().pathSum(root, 22),
            equalTo(getLists(arrayOf(intArrayOf(5, 4, 11, 2), intArrayOf(5, 8, 4, 5)))),
        )
    }

    @Test
    fun pathSum2() {
        val root: TreeNode? = TreeNode.create(listOf(1, 2, 3))
        assertThat(Solution().pathSum(root, 5), equalTo(getLists(arrayOf<IntArray>())))
    }

    @Test
    fun pathSum3() {
        val root: TreeNode? = TreeNode.create(listOf(1, 2))
        assertThat(Solution().pathSum(root, 0), equalTo(getLists(arrayOf<IntArray>())))
    }
}
