package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun assignEdgeWeights() {
        assertThat<Int>(
            Solution().assignEdgeWeights(arrayOf<IntArray>(intArrayOf(1, 2))),
            equalTo<Int>(1),
        )
    }

    @Test
    fun assignEdgeWeights2() {
        assertThat<Int>(
            Solution().assignEdgeWeights(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(3, 4),
                    intArrayOf(3, 5),
                ),
            ),
            equalTo<Int>(2),
        )
    }
}
