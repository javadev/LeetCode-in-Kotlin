package g3601_3700.s3700_number_of_zigzag_arrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun zigZagArrays() {
        assertThat<Int>(Solution().zigZagArrays(3, 4, 5), equalTo<Int>(2))
    }

    @Test
    fun zigZagArrays2() {
        assertThat<Int>(Solution().zigZagArrays(3, 1, 3), equalTo<Int>(10))
    }
}
