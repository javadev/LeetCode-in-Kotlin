package g0101_0200.s0119_pascals_triangle_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getRow() {
        val expected = listOf(1, 3, 3, 1)
        assertThat(Solution().getRow(3), equalTo(expected))
    }

    @Test
    fun getRow2() {
        val expected = listOf(1)
        assertThat(Solution().getRow(0), equalTo(expected))
    }

    @Test
    fun getRow3() {
        val expected = listOf(1, 1)
        assertThat(Solution().getRow(1), equalTo(expected))
    }
}
