package g0101_0200.s0118_pascals_triangle

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generate() {
        val expected: List<List<Int>> = ArrayUtils.getLists(
            arrayOf(
                intArrayOf(1),
                intArrayOf(1, 1),
                intArrayOf(1, 2, 1),
                intArrayOf(1, 3, 3, 1),
                intArrayOf(1, 4, 6, 4, 1),
            ),
        )
        assertThat(Solution().generate(5), equalTo(expected))
    }

    @Test
    fun generate2() {
        val expected: List<List<Int>> = ArrayUtils.getLists(arrayOf(intArrayOf(1)))
        assertThat(Solution().generate(1), equalTo(expected))
    }
}
