package g0201_0300.s0221_maximal_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximalSquare() {
        val input = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'), charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'), charArrayOf('1', '0', '0', '1', '0')
        )
        assertThat(Solution().maximalSquare(input), equalTo(4))
    }

    @Test
    fun maximalSquare2() {
        val input = arrayOf(charArrayOf('0', '1'), charArrayOf('1', '0'))
        assertThat(Solution().maximalSquare(input), equalTo(1))
    }

    @Test
    fun maximalSquare3() {
        val input = arrayOf(charArrayOf('0'))
        assertThat(Solution().maximalSquare(input), equalTo(0))
    }
}
