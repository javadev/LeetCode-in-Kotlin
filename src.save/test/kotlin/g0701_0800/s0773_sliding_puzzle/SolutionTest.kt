package g0701_0800.s0773_sliding_puzzle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun slidingPuzzle() {
        assertThat(Solution().slidingPuzzle(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5))), equalTo(1))
    }

    @Test
    fun slidingPuzzle2() {
        assertThat(Solution().slidingPuzzle(arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0))), equalTo(-1))
    }

    @Test
    fun slidingPuzzle3() {
        assertThat(Solution().slidingPuzzle(arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3))), equalTo(5))
    }
}
