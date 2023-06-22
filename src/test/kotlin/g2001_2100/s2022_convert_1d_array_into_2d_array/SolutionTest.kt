package g2001_2100.s2022_convert_1d_array_into_2d_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun construct2DArray() {
        MatcherAssert.assertThat(
            Solution().construct2DArray(intArrayOf(1, 2, 3, 4), 2, 2),
            CoreMatchers.equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
        )
    }

    @Test
    fun construct2DArray2() {
        MatcherAssert.assertThat(
            Solution().construct2DArray(intArrayOf(1, 2, 3), 1, 3),
            CoreMatchers.equalTo(arrayOf(intArrayOf(1, 2, 3)))
        )
    }

    @Test
    fun construct2DArray3() {
        MatcherAssert.assertThat(
            Solution().construct2DArray(intArrayOf(1, 2), 1, 1), CoreMatchers.equalTo(arrayOf())
        )
    }
}
