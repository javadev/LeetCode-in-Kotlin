package g4001_4100.s4034_minimum_bishop_moves_to_reach_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minBishopMoves() {
        assertThat<Int>(
            Solution().minBishopMoves(intArrayOf(0, 0), intArrayOf(0, 0)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minBishopMoves2() {
        assertThat<Int>(
            Solution().minBishopMoves(intArrayOf(0, 0), intArrayOf(3, 3)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minBishopMoves3() {
        assertThat<Int>(
            Solution().minBishopMoves(intArrayOf(0, 0), intArrayOf(2, 4)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minBishopMoves4() {
        assertThat<Int>(
            Solution().minBishopMoves(intArrayOf(0, 0), intArrayOf(1, 0)),
            equalTo<Int>(-1),
        )
    }
}
