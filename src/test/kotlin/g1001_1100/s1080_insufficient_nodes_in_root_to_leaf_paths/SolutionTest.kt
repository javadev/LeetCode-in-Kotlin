package g1001_1100.s1080_insufficient_nodes_in_root_to_leaf_paths

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sufficientSubset() {
        assertThat(
            Solution()
                .sufficientSubset(
                    TreeNode.create(
                        listOf(
                            1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13,
                            -99, 14
                        )
                    ),
                    1
                )
                .toString(),
            equalTo("1,2,4,8,9,null,3,null,7,null,14")
        )
    }

    @Test
    fun sufficientSubset2() {
        assertThat(
            Solution()
                .sufficientSubset(
                    TreeNode.create(
                        listOf(
                            5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3
                        )
                    ),
                    22
                )
                .toString(),
            equalTo("5,4,11,7,null,null,8,17,4,5,null")
        )
    }

    @Test
    fun sufficientSubset3() {
        assertThat(
            Solution()
                .sufficientSubset(
                    TreeNode.create(listOf(1, 2, -3, -5, null, 4, null)), -1
                )
                .toString(),
            equalTo("1,null,-3,4,null")
        )
    }
}
