package g0101_0200.s0120_triangle

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTotal() {
        val triangle: List<List<Int>> =
            ArrayUtils.getLists(arrayOf(intArrayOf(2), intArrayOf(3, 4), intArrayOf(6, 5, 7), intArrayOf(4, 1, 8, 3)))
        assertThat(Solution().minimumTotal(triangle), equalTo(11))
    }

    @Test
    fun minimumTotal2() {
        val triangle: List<List<Int>> = ArrayUtils.getLists(arrayOf(intArrayOf(-10)))
        assertThat(Solution().minimumTotal(triangle), equalTo(-10))
    }
}
