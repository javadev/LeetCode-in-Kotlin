package g0501_0600.s0517_super_washing_machines

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinMoves() {
        assertThat(Solution().findMinMoves(intArrayOf(1, 0, 5)), equalTo(3))
    }

    @Test
    fun findMinMoves2() {
        assertThat(Solution().findMinMoves(intArrayOf(0, 3, 0)), equalTo(2))
    }
}
