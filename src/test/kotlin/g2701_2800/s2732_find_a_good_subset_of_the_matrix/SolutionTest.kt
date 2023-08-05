package g2701_2800.s2732_find_a_good_subset_of_the_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodSubsetofBinaryMatrix() {
        assertThat(
            Solution().goodSubsetofBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 0, 0, 1), intArrayOf(1, 1, 1, 1)
                )
            ),
            equalTo(listOf(0, 1))
        )
    }

    @Test
    fun goodSubsetofBinaryMatrix2() {
        assertThat(Solution().goodSubsetofBinaryMatrix(arrayOf(intArrayOf(0))), equalTo(listOf(0)))
    }

    @Test
    fun goodSubsetofBinaryMatrix3() {
        assertThat(
            Solution().goodSubsetofBinaryMatrix(
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1)
                )
            ),
            equalTo(listOf())
        )
    }
}
