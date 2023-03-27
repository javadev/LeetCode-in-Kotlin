package g0301_0400.s0391_perfect_rectangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isRectangleCover() {
        assertThat(
            Solution()
                .isRectangleCover(
                    arrayOf(
                        intArrayOf(1, 1, 3, 3),
                        intArrayOf(3, 1, 4, 2),
                        intArrayOf(3, 2, 4, 4),
                        intArrayOf(1, 3, 2, 4),
                        intArrayOf(2, 3, 3, 4)
                    )
                ),
            equalTo(true)
        )
    }

    @Test
    fun isRectangleCover2() {
        assertThat(
            Solution()
                .isRectangleCover(
                    arrayOf(
                        intArrayOf(1, 1, 2, 3),
                        intArrayOf(1, 3, 2, 4),
                        intArrayOf(3, 1, 4, 2),
                        intArrayOf(3, 2, 4, 4)
                    )
                ),
            equalTo(false)
        )
    }

    @Test
    fun isRectangleCover3() {
        assertThat(
            Solution()
                .isRectangleCover(
                    arrayOf(
                        intArrayOf(1, 1, 3, 3),
                        intArrayOf(3, 1, 4, 2),
                        intArrayOf(1, 3, 2, 4),
                        intArrayOf(3, 2, 4, 4)
                    )
                ),
            equalTo(false)
        )
    }

    @Test
    fun isRectangleCover4() {
        assertThat(
            Solution()
                .isRectangleCover(
                    arrayOf(
                        intArrayOf(1, 1, 3, 3),
                        intArrayOf(3, 1, 4, 2),
                        intArrayOf(1, 3, 2, 4),
                        intArrayOf(2, 2, 4, 4)
                    )
                ),
            equalTo(false)
        )
    }
}
