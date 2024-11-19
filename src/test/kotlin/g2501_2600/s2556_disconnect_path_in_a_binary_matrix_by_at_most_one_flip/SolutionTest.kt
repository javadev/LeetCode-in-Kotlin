package g2501_2600.s2556_disconnect_path_in_a_binary_matrix_by_at_most_one_flip

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossibleToCutPath() {
        assertThat(
            Solution().isPossibleToCutPath(
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 1),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun isPossibleToCutPath2() {
        assertThat(
            Solution().isPossibleToCutPath(
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 0, 1),
                    intArrayOf(1, 1, 1),
                ),
            ),
            equalTo(false),
        )
    }
}
