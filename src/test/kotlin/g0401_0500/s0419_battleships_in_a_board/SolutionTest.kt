package g0401_0500.s0419_battleships_in_a_board

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBattleships() {
        val matrix =
            arrayOf(charArrayOf('X', '.', '.', 'X'), charArrayOf('.', '.', '.', 'X'), charArrayOf('.', '.', '.', 'X'))
        assertThat(Solution().countBattleships(matrix), equalTo(2))
    }

    @Test
    fun countBattleships2() {
        val matrix = arrayOf(charArrayOf('.'))
        assertThat(Solution().countBattleships(matrix), equalTo(0))
    }
}
