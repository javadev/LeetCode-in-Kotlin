package g3601_3700.s3609_minimum_moves_to_reach_target_in_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat<Int>(Solution().minMoves(1, 2, 5, 4), equalTo<Int>(2))
    }

    @Test
    fun minMoves2() {
        assertThat<Int>(Solution().minMoves(0, 1, 2, 3), equalTo<Int>(3))
    }

    @Test
    fun minMoves3() {
        assertThat<Int>(Solution().minMoves(1, 1, 2, 2), equalTo<Int>(-1))
    }

    @Test
    fun minMoves4() {
        assertThat<Int>(Solution().minMoves(0, 0, 0, 0), equalTo<Int>(0))
    }

    @Test
    fun minMoves5() {
        assertThat<Int>(Solution().minMoves(0, 0, 1, 0), equalTo<Int>(-1))
        assertThat<Int>(Solution().minMoves(0, 0, 0, 1), equalTo<Int>(-1))
    }

    @Test
    fun minMoves6() {
        assertThat<Int>(Solution().minMoves(2, 0, 1, 0), equalTo<Int>(-1))
    }

    @Test
    fun minMoves7() {
        assertThat<Int>(Solution().minMoves(0, 2, 0, 1), equalTo<Int>(-1))
    }

    @Test
    fun minMoves8() {
        assertThat<Int>(Solution().minMoves(1, 1, 9, 4), equalTo<Int>(-1))
    }

    @Test
    fun minMoves9() {
        val result = Solution().minMoves(1, 1, 8, 3)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves10() {
        val result = Solution().minMoves(1, 1, 6, 4)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves11() {
        assertThat<Int>(Solution().minMoves(1, 1, 4, 9), equalTo<Int>(-1))
    }

    @Test
    fun minMoves12() {
        val result = Solution().minMoves(1, 1, 3, 8)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves13() {
        val result = Solution().minMoves(1, 1, 4, 6)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves14() {
        val result = Solution().minMoves(0, 2, 5, 5)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves15() {
        val result = Solution().minMoves(2, 0, 5, 5)
        assertThat<Int>(result, equalTo<Int>(-1))
    }

    @Test
    fun minMoves16() {
        assertThat<Int>(Solution().minMoves(2, 2, 5, 5), equalTo<Int>(-1))
    }

    @Test
    fun minMoves17() {
        val result = Solution().minMoves(1, 1, 5, 2)
        assertThat<Int>(result, equalTo<Int>(-1))
    }
}
