package g1601_1700.s1626_best_team_with_no_conflicts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestTeamScore() {
        assertThat(
            Solution()
                .bestTeamScore(intArrayOf(1, 3, 5, 10, 15), intArrayOf(1, 2, 3, 4, 5)),
            equalTo(34),
        )
    }

    @Test
    fun bestTeamScore2() {
        assertThat(
            Solution().bestTeamScore(intArrayOf(4, 5, 6, 5), intArrayOf(2, 1, 2, 1)),
            equalTo(16),
        )
    }

    @Test
    fun bestTeamScore3() {
        assertThat(
            Solution().bestTeamScore(intArrayOf(1, 2, 3, 5), intArrayOf(8, 9, 10, 1)),
            equalTo(6),
        )
    }
}
