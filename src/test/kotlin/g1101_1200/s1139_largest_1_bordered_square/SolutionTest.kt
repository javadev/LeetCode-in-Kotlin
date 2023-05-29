package g1101_1200.s1139_largest_1_bordered_square

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largest1BorderedSquare() {
        MatcherAssert.assertThat(
            Solution()
                .largest1BorderedSquare(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))),
            CoreMatchers.equalTo(9)
        )
    }

    @Test
    fun largest1BorderedSquare2() {
        MatcherAssert.assertThat(
            Solution().largest1BorderedSquare(arrayOf(intArrayOf(1, 1, 0, 0))),
            CoreMatchers.equalTo(1)
        )
    }
}