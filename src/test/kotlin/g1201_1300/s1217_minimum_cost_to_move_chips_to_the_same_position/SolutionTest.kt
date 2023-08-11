package g1201_1300.s1217_minimum_cost_to_move_chips_to_the_same_position

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostToMoveChips() {
        assertThat(Solution().minCostToMoveChips(intArrayOf(1, 2, 3)), equalTo(1))
    }

    @Test
    fun minCostToMoveChips2() {
        assertThat(Solution().minCostToMoveChips(intArrayOf(2, 2, 2, 3, 3)), equalTo(2))
    }

    @Test
    fun minCostToMoveChips3() {
        assertThat(Solution().minCostToMoveChips(intArrayOf(1, 1000000000)), equalTo(1))
    }
}
