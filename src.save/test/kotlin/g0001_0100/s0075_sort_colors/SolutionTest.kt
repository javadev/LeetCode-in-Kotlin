package g0001_0100.s0075_sort_colors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortColors() {
        val array = intArrayOf(2, 0, 2, 1, 1, 0)
        Solution().sortColors(array)
        val expected = intArrayOf(0, 0, 1, 1, 2, 2)
        assertThat(array, equalTo(expected))
    }

    @Test
    fun sortColors2() {
        val array = intArrayOf(2, 0, 1)
        Solution().sortColors(array)
        val expected = intArrayOf(0, 1, 2)
        assertThat(array, equalTo(expected))
    }
}
