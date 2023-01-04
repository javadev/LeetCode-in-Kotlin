package g0201_0300.s0218_the_skyline_problem

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getSkyline() {
        val buildings = arrayOf(
            intArrayOf(2, 9, 10),
            intArrayOf(3, 7, 15),
            intArrayOf(5, 12, 12),
            intArrayOf(15, 20, 10),
            intArrayOf(19, 24, 8)
        )
        val expected = arrayOf(
            intArrayOf(2, 10),
            intArrayOf(3, 15),
            intArrayOf(7, 12),
            intArrayOf(12, 0),
            intArrayOf(15, 10),
            intArrayOf(20, 8),
            intArrayOf(24, 0)
        )
        assertThat(Solution().getSkyline(buildings), equalTo(ArrayUtils.getLists(expected)))
    }

    @Test
    fun getSkyline2() {
        val buildings = arrayOf(intArrayOf(0, 2, 3), intArrayOf(2, 5, 3))
        val expected = arrayOf(intArrayOf(0, 3), intArrayOf(5, 0))
        assertThat(Solution().getSkyline(buildings), equalTo(ArrayUtils.getLists(expected)))
    }
}
