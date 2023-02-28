package g0101_0200.s0189_rotate_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotate() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        Solution().rotate(array, 3)
        assertThat(array, equalTo(intArrayOf(5, 6, 7, 1, 2, 3, 4)))
    }

    @Test
    fun rotate2() {
        val array = intArrayOf(-1, -100, 3, 99)
        Solution().rotate(array, 2)
        assertThat(array, equalTo(intArrayOf(3, 99, -1, -100)))
    }
}
