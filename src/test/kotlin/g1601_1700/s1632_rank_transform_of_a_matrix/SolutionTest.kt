package g1601_1700.s1632_rank_transform_of_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixRankTransform() {
        assertThat(
            Solution().matrixRankTransform(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))),
        )
    }

    @Test
    fun matrixRankTransform2() {
        assertThat(
            Solution().matrixRankTransform(arrayOf(intArrayOf(7, 7), intArrayOf(7, 7))),
            equalTo(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))),
        )
    }

    @Test
    fun matrixRankTransform3() {
        assertThat(
            Solution()
                .matrixRankTransform(
                    arrayOf(
                        intArrayOf(20, -21, 14),
                        intArrayOf(-19, 4, 19),
                        intArrayOf(22, -47, 24),
                        intArrayOf(-19, 4, 19),
                    ),
                ),
            equalTo(
                arrayOf(
                    intArrayOf(4, 2, 3),
                    intArrayOf(1, 3, 4),
                    intArrayOf(5, 1, 6),
                    intArrayOf(1, 3, 4),
                ),
            ),
        )
    }
}
