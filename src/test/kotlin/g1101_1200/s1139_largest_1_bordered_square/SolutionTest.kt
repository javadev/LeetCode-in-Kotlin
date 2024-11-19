package g1101_1200.s1139_largest_1_bordered_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largest1BorderedSquare() {
        assertThat(
            Solution()
                .largest1BorderedSquare(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))),
            equalTo(9),
        )
    }

    @Test
    fun largest1BorderedSquare2() {
        assertThat(
            Solution().largest1BorderedSquare(arrayOf(intArrayOf(1, 1, 0, 0))),
            equalTo(1),
        )
    }
}
