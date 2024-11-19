package g1801_1900.s1895_largest_magic_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestMagicSquare() {
        assertThat(
            Solution()
                .largestMagicSquare(
                    arrayOf(
                        intArrayOf(7, 1, 4, 5, 6),
                        intArrayOf(2, 5, 1, 6, 4),
                        intArrayOf(1, 5, 4, 3, 2),
                        intArrayOf(1, 2, 7, 3, 4),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun largestMagicSquare2() {
        assertThat(
            Solution()
                .largestMagicSquare(arrayOf(intArrayOf(5, 1, 3, 1), intArrayOf(9, 3, 3, 1), intArrayOf(1, 3, 3, 8))),
            equalTo(2),
        )
    }
}
