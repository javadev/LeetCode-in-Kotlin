package g0401_0500.s0452_minimum_number_of_arrows_to_burst_balloons

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinArrowShots() {
        val points: Array<IntArray> = arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))
        assertThat(Solution().findMinArrowShots(points), equalTo(2))
    }

    @Test
    fun findMinArrowShots2() {
        val points: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6), intArrayOf(7, 8))
        assertThat(Solution().findMinArrowShots(points), equalTo(4))
    }

    @Test
    fun findMinArrowShots3() {
        val points: Array<IntArray> = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))
        assertThat(Solution().findMinArrowShots(points), equalTo(2))
    }
}
