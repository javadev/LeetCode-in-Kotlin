package g0401_0500.s0437_path_sum_iii

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun pathSum() {
        assertThat(
            Solution()
                .pathSum(
                    TreeNode.create(
                        Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)
                    ),
                    8
                ),
            equalTo(3)
        )
    }

    @Test
    fun pathSum2() {
        assertThat(
            Solution()
                .pathSum(
                    TreeNode.create(
                        Arrays.asList(
                            5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1
                        )
                    ),
                    22
                ),
            equalTo(3)
        )
    }
}
