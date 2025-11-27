package g0801_0900.s0840_magic_squares_in_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMagicSquaresInside() {
        assertThat(
            Solution()
                .numMagicSquaresInside(arrayOf(intArrayOf(4, 3, 8, 4), intArrayOf(9, 5, 1, 9), intArrayOf(2, 7, 6, 2))),
            equalTo(1),
        )
    }

    @Test
    fun numMagicSquaresInside2() {
        assertThat(Solution().numMagicSquaresInside(arrayOf(intArrayOf(8))), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside3() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6),
            intArrayOf(3, 5, 7),
            intArrayOf(4, 9, 2),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(1))
    }

    @Test
    fun numMagicSquaresInside4() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6, 8, 1, 6),
            intArrayOf(3, 5, 7, 3, 5, 7),
            intArrayOf(4, 9, 2, 4, 9, 2),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(2))
    }

    @Test
    fun numMagicSquaresInside5() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6, 1),
            intArrayOf(3, 5, 7, 5),
            intArrayOf(4, 9, 2, 9),
            intArrayOf(8, 1, 6, 1),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(1))
    }

    @Test
    fun numMagicSquaresInside6() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6),
            intArrayOf(3, 5, 7),
            intArrayOf(4, 9, 8),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside7() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6),
            intArrayOf(3, 5, 20),
            intArrayOf(4, 9, 2),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside8() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6),
            intArrayOf(3, 5, 7),
            intArrayOf(4, 2, 9),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside9() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6),
            intArrayOf(3, 5, 7),
            intArrayOf(4, 9, 3),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside10() {
        val grid = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 6),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside11() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside12() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3, 8),
            intArrayOf(4, 5, 6, 1),
            intArrayOf(7, 8, 9, 6),
            intArrayOf(3, 5, 7, 7),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(0))
    }

    @Test
    fun numMagicSquaresInside13() {
        val grid = arrayOf(
            intArrayOf(8, 1, 6, 8),
            intArrayOf(3, 5, 7, 3),
            intArrayOf(4, 9, 2, 4),
            intArrayOf(8, 1, 6, 99),
        )
        assertThat(Solution().numMagicSquaresInside(grid), equalTo(1))
    }
}
