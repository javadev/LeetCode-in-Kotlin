package g2301_2400.s2319_check_if_matrix_is_x_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkXMatrix() {
        assertThat(
            Solution()
                .checkXMatrix(
                    arrayOf(
                        intArrayOf(2, 0, 0, 1),
                        intArrayOf(0, 3, 1, 0),
                        intArrayOf(0, 5, 2, 0),
                        intArrayOf(4, 0, 0, 2)
                    )
                ),
            equalTo(true)
        )
    }

    @Test
    fun checkXMatrix2() {
        assertThat(
            Solution().checkXMatrix(arrayOf(intArrayOf(5, 7, 0), intArrayOf(0, 3, 1), intArrayOf(0, 5, 0))),
            equalTo(false)
        )
    }

    @Test
    fun checkXMatrix3() {
        assertThat(
            Solution()
                .checkXMatrix(
                    arrayOf(
                        intArrayOf(0, 0, 0, 0, 1),
                        intArrayOf(0, 4, 0, 1, 0),
                        intArrayOf(0, 0, 5, 0, 0),
                        intArrayOf(0, 5, 0, 2, 0),
                        intArrayOf(4, 0, 0, 0, 2)
                    )
                ),
            equalTo(false)
        )
    }
}
