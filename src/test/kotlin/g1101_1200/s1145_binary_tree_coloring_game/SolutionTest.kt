package g1101_1200.s1145_binary_tree_coloring_game

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun btreeGameWinningMove() {
        val root = TreeNode.create(mutableListOf<Int?>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11))
        MatcherAssert.assertThat(Solution().btreeGameWinningMove(root, 11, 3), CoreMatchers.equalTo(true))
    }

    @Test
    fun btreeGameWinningMove2() {
        val root = TreeNode.create(mutableListOf<Int?>(1, 2, 3))
        MatcherAssert.assertThat(Solution().btreeGameWinningMove(root, 3, 1), CoreMatchers.equalTo(false))
    }
}
