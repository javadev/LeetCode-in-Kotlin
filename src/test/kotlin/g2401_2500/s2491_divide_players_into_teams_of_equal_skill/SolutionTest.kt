package g2401_2500.s2491_divide_players_into_teams_of_equal_skill

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dividePlayers() {
        assertThat(Solution().dividePlayers(intArrayOf(3, 2, 5, 1, 3, 4)), equalTo(22L))
    }

    @Test
    fun dividePlayers2() {
        assertThat(Solution().dividePlayers(intArrayOf(3, 4)), equalTo(12L))
    }

    @Test
    fun dividePlayers3() {
        assertThat(Solution().dividePlayers(intArrayOf(1, 1, 2, 3)), equalTo(-1L))
    }
}
