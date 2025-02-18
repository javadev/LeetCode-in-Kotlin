package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lenOfVDiagonal() {
        assertThat<Int>(
            Solution()
                .lenOfVDiagonal(
                    arrayOf<IntArray>(
                        intArrayOf(2, 2, 1, 2, 2),
                        intArrayOf(2, 0, 2, 2, 0),
                        intArrayOf(2, 0, 1, 1, 0),
                        intArrayOf(1, 0, 2, 2, 2),
                        intArrayOf(2, 0, 0, 2, 2),
                    ),
                ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun lenOfVDiagonal2() {
        assertThat<Int>(
            Solution()
                .lenOfVDiagonal(
                    arrayOf<IntArray>(
                        intArrayOf(2, 2, 2, 2, 2),
                        intArrayOf(2, 0, 2, 2, 0),
                        intArrayOf(2, 0, 1, 1, 0),
                        intArrayOf(1, 0, 2, 2, 2),
                        intArrayOf(2, 0, 0, 2, 2),
                    ),
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun lenOfVDiagonal3() {
        assertThat<Int>(
            Solution()
                .lenOfVDiagonal(
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 2, 2, 2),
                        intArrayOf(2, 2, 2, 2, 0),
                        intArrayOf(2, 0, 0, 0, 0),
                        intArrayOf(0, 0, 2, 2, 2),
                        intArrayOf(2, 0, 0, 2, 0),
                    ),
                ),
            equalTo<Int>(5),
        )
    }
}
