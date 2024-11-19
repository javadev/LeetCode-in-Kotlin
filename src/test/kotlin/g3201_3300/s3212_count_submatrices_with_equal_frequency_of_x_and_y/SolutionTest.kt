package g3201_3300.s3212_count_submatrices_with_equal_frequency_of_x_and_y

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubmatrices() {
        assertThat(
            Solution().numberOfSubmatrices(arrayOf(charArrayOf('X', 'Y', '.'), charArrayOf('Y', '.', '.'))),
            equalTo(3),
        )
    }

    @Test
    fun numberOfSubmatrices2() {
        assertThat(
            Solution().numberOfSubmatrices(arrayOf(charArrayOf('X', 'X'), charArrayOf('X', 'Y'))),
            equalTo(0),
        )
    }

    @Test
    fun numberOfSubmatrices3() {
        assertThat(
            Solution().numberOfSubmatrices(arrayOf(charArrayOf('.', '.'), charArrayOf('.', '.'))),
            equalTo(0),
        )
    }
}
