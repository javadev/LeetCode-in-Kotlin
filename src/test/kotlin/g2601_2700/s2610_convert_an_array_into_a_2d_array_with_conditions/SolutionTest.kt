package g2601_2700.s2610_convert_an_array_into_a_2d_array_with_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMatrix() {
        assertThat(
            Solution().findMatrix(intArrayOf(1, 3, 4, 1, 2, 3, 1)),
            equalTo(
                listOf(
                    listOf(1, 3, 4, 2),
                    listOf(1, 3),
                    listOf(1),
                ),
            ),
        )
    }

    @Test
    fun findMatrix2() {
        assertThat(Solution().findMatrix(intArrayOf(1, 2, 3, 4)), equalTo(listOf(listOf(1, 2, 3, 4))))
    }
}
