package g1001_1100.s1033_moving_stones_until_consecutive

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMovesStones() {
        assertThat(Solution().numMovesStones(1, 2, 5), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun numMovesStones2() {
        assertThat(Solution().numMovesStones(4, 3, 2), equalTo(intArrayOf(0, 0)))
    }

    @Test
    fun numMovesStones3() {
        assertThat(Solution().numMovesStones(3, 5, 1), equalTo(intArrayOf(1, 2)))
    }
}
