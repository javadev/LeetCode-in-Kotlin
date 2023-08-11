package g1901_2000.s1926_nearest_exit_from_entrance_in_maze

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nearestExit() {
        assertThat(
            Solution()
                .nearestExit(
                    arrayOf(
                        charArrayOf('+', '+', '.', '+'),
                        charArrayOf('.', '.', '.', '+'), charArrayOf('+', '+', '+', '.')
                    ),
                    intArrayOf(1, 2)
                ),
            equalTo(1)
        )
    }

    @Test
    fun nearestExit2() {
        assertThat(
            Solution()
                .nearestExit(
                    arrayOf(
                        charArrayOf('+', '+', '+'),
                        charArrayOf('.', '.', '.'), charArrayOf('+', '+', '+')
                    ),
                    intArrayOf(1, 0)
                ),
            equalTo(2)
        )
    }

    @Test
    fun nearestExit3() {
        assertThat(
            Solution().nearestExit(arrayOf(charArrayOf('.', '+')), intArrayOf(0, 0)),
            equalTo(-1)
        )
    }
}
