package g2401_2500.s2415_reverse_odd_levels_of_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseOddLevels() {
        assertThat(
            Solution()
                .reverseOddLevels(TreeNode.create(listOf(2, 3, 5, 8, 13, 21, 34))!!)
                .toString(),
            equalTo("2,5,8,13,3,21,34")
        )
    }

    @Test
    fun reverseOddLevels2() {
        assertThat(
            Solution()
                .reverseOddLevels(TreeNode.create(listOf(7, 13, 11))!!)
                .toString(),
            equalTo("7,11,13")
        )
    }
}
