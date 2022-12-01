package g0001_0100.s0074_search_a_2d_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun searchMatrix() {
        assertThat(
            Solution().searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ),
                3
            ),
            equalTo(true)
        )
    }

    @Test
    fun searchMatrix2() {
        assertThat(
            Solution().searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ),
                13
            ),
            equalTo(false)
        )
    }
}
