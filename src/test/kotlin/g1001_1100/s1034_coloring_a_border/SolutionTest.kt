package g1001_1100.s1034_coloring_a_border

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun colorBorder() {
        assertThat(
            Solution().colorBorder(arrayOf(intArrayOf(1, 1), intArrayOf(1, 2)), 0, 0, 3),
            equalTo(arrayOf(intArrayOf(3, 3), intArrayOf(3, 2))),
        )
    }

    @Test
    fun colorBorder2() {
        assertThat(
            Solution().colorBorder(arrayOf(intArrayOf(1, 2, 2), intArrayOf(2, 3, 2)), 0, 1, 3),
            equalTo(arrayOf(intArrayOf(1, 3, 3), intArrayOf(2, 3, 3))),
        )
    }

    @Test
    fun colorBorder3() {
        assertThat(
            Solution().colorBorder(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1)), 1, 1, 2),
            equalTo(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 1, 2), intArrayOf(2, 2, 2))),
        )
    }
}
