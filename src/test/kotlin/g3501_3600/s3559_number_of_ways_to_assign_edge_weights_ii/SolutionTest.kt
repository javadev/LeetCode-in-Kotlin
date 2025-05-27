package g3501_3600.s3559_number_of_ways_to_assign_edge_weights_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun assignEdgeWeights() {
        assertThat<IntArray>(
            Solution()
                .assignEdgeWeights(
                    arrayOf<IntArray>(intArrayOf(1, 2)),
                    arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(1, 2)),
                ),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }

    @Test
    fun assignEdgeWeights2() {
        assertThat<IntArray>(
            Solution()
                .assignEdgeWeights(
                    arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4), intArrayOf(3, 5)),
                    arrayOf<IntArray>(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(2, 5)),
                ),
            equalTo<IntArray>(intArrayOf(2, 1, 4)),
        )
    }
}
