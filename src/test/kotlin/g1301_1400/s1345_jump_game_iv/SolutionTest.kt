package g1301_1400.s1345_jump_game_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minJumps() {
        assertThat(
            Solution().minJumps(intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)),
            equalTo(3),
        )
    }

    @Test
    fun minJumps2() {
        assertThat(Solution().minJumps(intArrayOf(7)), equalTo(0))
    }

    @Test
    fun minJumps3() {
        assertThat(Solution().minJumps(intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)), equalTo(1))
    }
}
