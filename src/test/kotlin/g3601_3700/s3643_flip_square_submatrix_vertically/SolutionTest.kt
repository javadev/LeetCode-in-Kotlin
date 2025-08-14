package g3601_3700.s3643_flip_square_submatrix_vertically

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseSubmatrix() {
        MatcherAssert.assertThat<Array<IntArray>>(
            Solution()
                .reverseSubmatrix(
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 3, 4),
                        intArrayOf(5, 6, 7, 8),
                        intArrayOf(9, 10, 11, 12),
                        intArrayOf(13, 14, 15, 16),
                    ),
                    1,
                    0,
                    3,
                ),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(13, 14, 15, 8),
                    intArrayOf(9, 10, 11, 12),
                    intArrayOf(5, 6, 7, 16),
                ),
            ),
        )
    }

    @Test
    fun reverseSubmatrix2() {
        MatcherAssert.assertThat<Array<IntArray>>(
            Solution().reverseSubmatrix(arrayOf<IntArray>(intArrayOf(3, 4, 2, 3), intArrayOf(2, 3, 4, 2)), 0, 2, 2),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(3, 4, 4, 2), intArrayOf(2, 3, 2, 3))),
        )
    }
}
