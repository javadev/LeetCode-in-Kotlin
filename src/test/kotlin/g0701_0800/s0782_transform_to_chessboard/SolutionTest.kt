package g0701_0800.s0782_transform_to_chessboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun movesToChessboard() {
        assertThat(
            Solution()
                .movesToChessboard(
                    arrayOf(
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(1, 0, 0, 1),
                        intArrayOf(1, 0, 0, 1),
                    ),
                ),
            equalTo(2),
        )
    }

    @Test
    fun movesToChessboard2() {
        assertThat(Solution().movesToChessboard(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))), equalTo(0))
    }

    @Test
    fun movesToChessboard3() {
        assertThat(Solution().movesToChessboard(arrayOf(intArrayOf(1, 0), intArrayOf(1, 0))), equalTo(-1))
    }

    @Test
    fun movesToChessboard4() {
        assertThat(
            Solution()
                .movesToChessboard(
                    arrayOf(
                        intArrayOf(0, 0, 1, 1),
                        intArrayOf(1, 1, 0, 0),
                        intArrayOf(0, 1, 0, 1),
                        intArrayOf(1, 0, 1, 0),
                    ),
                ),
            equalTo(-1),
        )
    }

    @Test
    fun movesToChessboard5() {
        assertThat(
            Solution()
                .movesToChessboard(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(0, 0, 0, 0),
                        intArrayOf(0, 0, 0, 0),
                    ),
                ),
            equalTo(-1),
        )
    }

    @Test
    fun movesToChessboard6() {
        assertThat(
            Solution()
                .movesToChessboard(
                    arrayOf(
                        intArrayOf(1, 1, 0),
                        intArrayOf(0, 0, 1),
                        intArrayOf(0, 0, 1),
                    ),
                ),
            equalTo(2),
        )
    }

    @Test
    fun movesToChessboard7() {
        assertThat(
            Solution()
                .movesToChessboard(
                    arrayOf(
                        intArrayOf(1, 0, 0),
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 0, 0),
                    ),
                ),
            equalTo(1),
        )
    }
}
