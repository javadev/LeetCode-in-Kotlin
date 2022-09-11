package g0201_0300.s0283_move_zeroes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun moveZeroes() {
        val array = intArrayOf(0, 1, 0, 3, 12)
        Solution().moveZeroes(array)
        assertThat(array, equalTo(intArrayOf(1, 3, 12, 0, 0)))
    }

    @Test
    fun moveZeroes2() {
        val array = intArrayOf(0)
        Solution().moveZeroes(array)
        assertThat(array, equalTo(intArrayOf(0)))
    }
}
