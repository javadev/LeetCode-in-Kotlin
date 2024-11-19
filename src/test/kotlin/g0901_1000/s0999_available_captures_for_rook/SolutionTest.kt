package g0901_1000.s0999_available_captures_for_rook

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numRookCaptures() {
        assertThat(
            Solution()
                .numRookCaptures(
                    arrayOf(
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'R', '.', '.', '.', 'p'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun numRookCaptures2() {
        assertThat(
            Solution()
                .numRookCaptures(
                    arrayOf(
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', 'p', 'p', 'p', 'p', 'p', '.', '.'),
                        charArrayOf('.', 'p', 'p', 'B', 'p', 'p', '.', '.'),
                        charArrayOf('.', 'p', 'B', 'R', 'B', 'p', '.', '.'),
                        charArrayOf('.', 'p', 'p', 'B', 'p', 'p', '.', '.'),
                        charArrayOf('.', 'p', 'p', 'p', 'p', 'p', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                    ),
                ),
            equalTo(0),
        )
    }

    @Test
    fun numRookCaptures3() {
        assertThat(
            Solution()
                .numRookCaptures(
                    arrayOf(
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                        charArrayOf('p', 'p', '.', 'R', '.', 'p', 'B', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'B', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', 'p', '.', '.', '.', '.'),
                        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.'),
                    ),
                ),
            equalTo(3),
        )
    }
}
