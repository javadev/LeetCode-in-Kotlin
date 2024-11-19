package g0701_0800.s0766_toeplitz_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isToeplitzMatrix() {
        assertThat(
            Solution()
                .isToeplitzMatrix(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 1, 2, 3), intArrayOf(9, 5, 1, 2))),
            equalTo(true),
        )
    }

    @Test
    fun isToeplitzMatrix2() {
        assertThat(
            Solution()
                .isToeplitzMatrix(arrayOf(intArrayOf(1, 2), intArrayOf(2, 2))),
            equalTo(false),
        )
    }

    @Test
    fun isToeplitzMatrix3() {
        assertThat(
            Solution()
                .isToeplitzMatrix(
                    arrayOf(
                        intArrayOf(1, 2, 3, 4, 5, 9),
                        intArrayOf(5, 1, 2, 3, 4, 5),
                        intArrayOf(9, 5, 1, 2, 3, 4),
                    ),
                ),
            equalTo(true),
        )
    }
}
