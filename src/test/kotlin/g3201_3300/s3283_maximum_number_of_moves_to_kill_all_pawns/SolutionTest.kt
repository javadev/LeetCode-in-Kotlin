package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxMoves() {
        assertThat<Int>(
            Solution().maxMoves(1, 1, arrayOf(intArrayOf(0, 0))),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxMoves2() {
        assertThat<Int>(
            Solution().maxMoves(
                0,
                2,
                arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3)),
            ),
            equalTo<Int>(8),
        )
    }

    @Test
    fun maxMoves3() {
        assertThat<Int>(
            Solution().maxMoves(
                0,
                0,
                arrayOf(intArrayOf(1, 2), intArrayOf(2, 4)),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxMoves4() {
        assertThat(
            Solution().maxMoves(0, 0, arrayOf()),
            equalTo(0),
        )
    }

    @Test
    fun maxMoves5() {
        assertThat(
            Solution().maxMoves(49, 49, arrayOf(intArrayOf(48, 48))),
            equalTo(4),
        )
    }

    @Test
    fun maxMoves6() {
        assertThat(
            Solution().maxMoves(1, 1, arrayOf(intArrayOf(2, 2), intArrayOf(2, 2), intArrayOf(3, 3))),
            equalTo(6),
        )
    }

    @Test
    fun maxMoves7() {
        val positions = Array(50) { intArrayOf(it, it) }
        assertThat(
            Solution().maxMoves(0, 0, positions),
            equalTo(266),
        )
    }
}
