package g3201_3300.s3276_select_cells_in_grid_with_maximum_score

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(
            Solution()
                .maxScore(
                    getLists(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 3, 2), intArrayOf(1, 1, 1))),
                ),
            equalTo(8),
        )
    }

    @Test
    fun maxScore2() {
        assertThat(
            Solution().maxScore(getLists(arrayOf(intArrayOf(8, 7, 6), intArrayOf(8, 3, 2)))),
            equalTo(15),
        )
    }
}
