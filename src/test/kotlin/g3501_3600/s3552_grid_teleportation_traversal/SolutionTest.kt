package g3501_3600.s3552_grid_teleportation_traversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat<Int>(
            Solution().minMoves(arrayOf<String>("A..", ".A.", "...")),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minMoves2() {
        assertThat<Int>(
            Solution().minMoves(arrayOf<String>(".#...", ".#.#.", ".#.#.", "...#.")),
            equalTo<Int>(13),
        )
    }

    @Test
    fun minMoves3() {
        assertThat<Int>(Solution().minMoves(arrayOf<String>(".", "A")), equalTo<Int>(1))
    }

    @Test
    fun minMoves4() {
        assertThat<Int>(Solution().minMoves(arrayOf<String>(".D", "EH")), equalTo<Int>(2))
    }

    @Test
    fun minMoves5() {
        assertThat<Int>(Solution().minMoves(arrayOf<String>(".")), equalTo<Int>(0))
    }

    @Test
    fun minMoves6() {
        assertThat<Int>(Solution().minMoves(arrayOf<String>(".", "#")), equalTo<Int>(-1))
    }
}
