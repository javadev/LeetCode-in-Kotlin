package g0501_0600.s0593_valid_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validSquare() {
        val p1 = intArrayOf(0, 0)
        val p2 = intArrayOf(1, 1)
        val p3 = intArrayOf(1, 0)
        val p4 = intArrayOf(0, 1)
        assertThat(Solution().validSquare(p1, p2, p3, p4), equalTo(true))
    }

    @Test
    fun validSquare2() {
        val p1 = intArrayOf(1, 1)
        val p2 = intArrayOf(5, 3)
        val p3 = intArrayOf(3, 5)
        val p4 = intArrayOf(7, 7)
        assertThat(Solution().validSquare(p1, p2, p3, p4), equalTo(false))
    }
}
