package g1701_1800.s1706_where_will_the_ball_fall

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findBall() {
        assertThat(
            Solution()
                .findBall(
                    arrayOf(
                        intArrayOf(1, 1, 1, -1, -1), intArrayOf(1, 1, 1, -1, -1),
                        intArrayOf(-1, -1, -1, 1, 1), intArrayOf(1, 1, 1, 1, -1),
                        intArrayOf(-1, -1, -1, -1, -1)
                    )
                ),
            equalTo(intArrayOf(1, -1, -1, -1, -1))
        )
    }

    @Test
    fun findBall2() {
        assertThat(Solution().findBall(arrayOf(intArrayOf(-1))), equalTo(intArrayOf(-1)))
    }

    @Test
    fun findBall3() {
        assertThat(
            Solution()
                .findBall(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(-1, -1, -1, -1, -1, -1),
                        intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(-1, -1, -1, -1, -1, -1)
                    )
                ),
            equalTo(intArrayOf(0, 1, 2, 3, 4, -1))
        )
    }
}
