package g2401_2500.s2410_maximum_matching_of_players_with_trainers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matchPlayersAndTrainers() {
        assertThat(
            Solution().matchPlayersAndTrainers(intArrayOf(4, 7, 9), intArrayOf(8, 2, 5, 8)),
            equalTo(2)
        )
    }

    @Test
    fun matchPlayersAndTrainers2() {
        assertThat(
            Solution().matchPlayersAndTrainers(intArrayOf(1, 1, 1), intArrayOf(10)),
            equalTo(1)
        )
    }
}
