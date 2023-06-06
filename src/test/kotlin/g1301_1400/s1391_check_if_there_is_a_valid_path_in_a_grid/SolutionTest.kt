package g1301_1400.s1391_check_if_there_is_a_valid_path_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasValidPath() {
        assertThat(
            Solution().hasValidPath(
                arrayOf(
                    intArrayOf(2, 4, 3),
                    intArrayOf(6, 5, 2)
                )
            ),
            equalTo(true)
        )
    }

    @Test
    fun hasValidPath2() {
        assertThat(
            Solution().hasValidPath(
                arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(1, 2, 1)
                )
            ),
            equalTo(false)
        )
    }

    @Test
    fun hasValidPath3() {
        assertThat(
            Solution().hasValidPath(arrayOf(intArrayOf(1, 1, 2))),
            equalTo(false)
        )
    }
}
