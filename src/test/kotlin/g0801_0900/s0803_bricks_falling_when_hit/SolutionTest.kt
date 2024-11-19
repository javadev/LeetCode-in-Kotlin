package g0801_0900.s0803_bricks_falling_when_hit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hitBricks() {
        assertThat(
            Solution()
                .hitBricks(arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(1, 1, 1, 0)), arrayOf(intArrayOf(1, 0))),
            equalTo(intArrayOf(2)),
        )
    }

    @Test
    fun hitBricks2() {
        assertThat(
            Solution()
                .hitBricks(
                    arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(1, 1, 0, 0)),
                    arrayOf(intArrayOf(1, 1), intArrayOf(1, 0)),
                ),
            equalTo(intArrayOf(0, 0)),
        )
    }
}
