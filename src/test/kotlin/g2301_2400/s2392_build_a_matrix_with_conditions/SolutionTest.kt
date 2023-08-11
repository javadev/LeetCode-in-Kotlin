package g2301_2400.s2392_build_a_matrix_with_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buildMatrix() {
        assertThat(
            Solution()
                .buildMatrix(
                    3,
                    arrayOf(intArrayOf(1, 2), intArrayOf(3, 2)),
                    arrayOf(intArrayOf(2, 1), intArrayOf(3, 2))
                ),
            equalTo(arrayOf(intArrayOf(0, 0, 1), intArrayOf(3, 0, 0), intArrayOf(0, 2, 0)))
        )
    }

    @Test
    fun buildMatrix2() {
        assertThat(
            Solution()
                .buildMatrix(
                    3,
                    arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1), intArrayOf(2, 3)),
                    arrayOf(intArrayOf(2, 1))
                ),
            equalTo(arrayOf())
        )
    }
}
