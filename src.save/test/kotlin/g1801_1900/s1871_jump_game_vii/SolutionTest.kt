package g1801_1900.s1871_jump_game_vii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canReach() {
        assertThat(Solution().canReach("011010", 2, 3), equalTo(true))
    }

    @Test
    fun canReach2() {
        assertThat(Solution().canReach("01101110", 2, 3), equalTo(false))
    }
}
