package g1901_2000.s1958_check_if_move_is_legal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkMove() {
        assertThat(
            Solution()
                .checkMove(
                    arrayOf(
                        charArrayOf('.', '.', '.', 'B', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'W', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'W', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'W', '.', '.', '.', '.'),
                        charArrayOf('W', 'B', 'B', '.', 'W', 'W', 'W', 'B'),
                        charArrayOf('.', '.', '.', 'B', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'B', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'W', '.', '.', '.', '.')
                    ),
                    4,
                    3,
                    'B'
                ),
            equalTo(true)
        )
    }

    @Test
    fun checkMove2() {
        assertThat(
            Solution()
                .checkMove(
                    arrayOf(
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', 'B', '.', '.', 'W', '.', '.', '.'),
                        charArrayOf('.', '.', 'W', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'W', 'B', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', 'B', 'W', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', 'W', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', 'B')
                    ),
                    4,
                    4,
                    'W'
                ),
            equalTo(false)
        )
    }
}
