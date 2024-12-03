package g3301_3400.s3367_maximize_sum_of_weights_after_edge_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeSumOfWeights() {
        assertThat<Long>(
            Solution()
                .maximizeSumOfWeights(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 4),
                        intArrayOf(0, 2, 2),
                        intArrayOf(2, 3, 12),
                        intArrayOf(2, 4, 6),
                    ),
                    2,
                ),
            equalTo<Long>(22L),
        )
    }

    @Test
    fun maximizeSumOfWeights2() {
        assertThat<Long>(
            Solution()
                .maximizeSumOfWeights(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 5),
                        intArrayOf(1, 2, 10),
                        intArrayOf(0, 3, 15),
                        intArrayOf(3, 4, 20),
                        intArrayOf(3, 5, 5),
                        intArrayOf(0, 6, 10),
                    ),
                    3,
                ),
            equalTo<Long>(65L),
        )
    }

    @Test
    fun maximizeSumOfWeights3() {
        assertThat<Long>(
            Solution().maximizeSumOfWeights(
                arrayOf<IntArray>(intArrayOf(0, 1, 34), intArrayOf(0, 2, 17)),
                1,
            ),
            equalTo<Long>(34L),
        )
    }
}
