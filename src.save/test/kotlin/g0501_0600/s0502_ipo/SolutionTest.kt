package g0501_0600.s0502_ipo

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximizedCapital() {
        assertThat(
            Solution().findMaximizedCapital(2, 0, intArrayOf(1, 2, 3), intArrayOf(0, 1, 1)),
            equalTo(4)
        )
    }

    @Test
    fun findMaximizedCapital2() {
        assertThat(
            Solution().findMaximizedCapital(3, 0, intArrayOf(1, 2, 3), intArrayOf(0, 1, 2)),
            equalTo(6)
        )
    }
}
