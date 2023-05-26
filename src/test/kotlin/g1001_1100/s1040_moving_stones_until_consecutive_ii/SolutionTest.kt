package g1001_1100.s1040_moving_stones_until_consecutive_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMovesStonesII() {
        assertThat(Solution().numMovesStonesII(intArrayOf(7, 4, 9)), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun numMovesStonesII2() {
        assertThat(
            Solution().numMovesStonesII(intArrayOf(6, 5, 4, 3, 10)),
            equalTo(intArrayOf(2, 3))
        )
    }
}
