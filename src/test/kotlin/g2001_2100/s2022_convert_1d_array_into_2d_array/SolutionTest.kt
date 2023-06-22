package g2001_2100.s2022_convert_1d_array_into_2d_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun construct2DArray() {
        assertThat(
            Solution().construct2DArray(intArrayOf(1, 2, 3, 4), 2, 2),
            equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
        )
    }

    @Test
    fun construct2DArray2() {
        assertThat(
            Solution().construct2DArray(intArrayOf(1, 2, 3), 1, 3),
            equalTo(arrayOf(intArrayOf(1, 2, 3)))
        )
    }

    @Test
    fun construct2DArray3() {
        assertThat(
            Solution().construct2DArray(intArrayOf(1, 2), 1, 1), equalTo(arrayOf())
        )
    }
}
