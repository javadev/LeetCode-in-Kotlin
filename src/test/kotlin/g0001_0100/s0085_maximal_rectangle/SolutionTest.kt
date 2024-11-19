package g0001_0100.s0085_maximal_rectangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximalRectangle() {
        val array = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0'),
        )
        assertThat(Solution().maximalRectangle(array), equalTo(6))
    }

    @Test
    fun maximalRectangle2() {
        val array = arrayOf(charArrayOf('0'))
        assertThat(Solution().maximalRectangle(array), equalTo(0))
    }

    @Test
    fun maximalRectangle3() {
        val array = arrayOf(charArrayOf('1'))
        assertThat(Solution().maximalRectangle(array), equalTo(1))
    }
}
