package g3301_3400.s3319_k_th_largest_perfect_subtree_size_in_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthLargestPerfectSubtree() {
        assertThat<Int>(
            Solution()
                .kthLargestPerfectSubtree(
                    TreeNode.create(
                        mutableListOf(5, 3, 6, 5, 2, 5, 7, 1, 8, null, null, 6, 8),
                    ),
                    2,
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun kthLargestPerfectSubtree2() {
        assertThat<Int>(
            Solution()
                .kthLargestPerfectSubtree(
                    TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6, 7)),
                    1,
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun kthLargestPerfectSubtree3() {
        assertThat<Int>(
            Solution()
                .kthLargestPerfectSubtree(
                    TreeNode.create(mutableListOf(1, 2, 3, null, 4)),
                    3,
                ),
            equalTo<Int>(-1),
        )
    }
}
