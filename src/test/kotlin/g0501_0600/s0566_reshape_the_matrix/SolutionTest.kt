package g0501_0600.s0566_reshape_the_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixReshape() {
        val mat = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        assertThat(Solution().matrixReshape(mat, 1, 4), equalTo(arrayOf(intArrayOf(1, 2, 3, 4))))
    }

    @Test
    fun matrixReshape2() {
        val mat = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        assertThat(Solution().matrixReshape(mat, 2, 4), equalTo(mat))
    }
}
