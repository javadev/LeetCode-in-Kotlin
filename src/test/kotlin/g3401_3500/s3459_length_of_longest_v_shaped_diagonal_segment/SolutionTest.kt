package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lenOfVDiagonal() {
        MatcherAssert.assertThat<Int>(
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
            CoreMatchers.equalTo<Int>(5),
        )
    }

    @Test
    fun lenOfVDiagonal2() {
        MatcherAssert.assertThat<Int>(
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
            CoreMatchers.equalTo<Int>(4),
        )
    }

    @Test
    fun lenOfVDiagonal3() {
        MatcherAssert.assertThat<Int>(
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
            CoreMatchers.equalTo<Int>(5),
        )
    }
}
