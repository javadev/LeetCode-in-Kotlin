package g3101_3200.s3148_maximum_difference_score_in_a_grid

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
                    getLists(
                        arrayOf(
                            intArrayOf(9, 5, 7, 3),
                            intArrayOf(8, 9, 6, 1),
                            intArrayOf(6, 7, 14, 3),
                            intArrayOf(2, 5, 3, 1)
                        )
                    )
                ),
            equalTo(9)
        )
    }

    @Test
    fun maxScore2() {
        assertThat(
            Solution().maxScore(getLists(arrayOf(intArrayOf(4, 3, 2), intArrayOf(3, 2, 1)))),
            equalTo(-1)
        )
    }
}
