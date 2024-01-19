package g2901_3000.s2966_divide_array_into_arrays_with_max_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divideArray() {
        assertThat(
            Solution().divideArray(intArrayOf(1, 3, 4, 8, 7, 9, 3, 5, 1), 2),
            equalTo(arrayOf<IntArray?>(intArrayOf(1, 1, 3), intArrayOf(3, 4, 5), intArrayOf(7, 8, 9)))
        )
    }

    @Test
    fun divideArray2() {
        assertThat(
            Solution().divideArray(intArrayOf(1, 3, 3, 2, 7, 3), 3),
            equalTo(arrayOf())
        )
    }
}
