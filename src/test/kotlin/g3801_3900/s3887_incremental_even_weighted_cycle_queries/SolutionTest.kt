package g3801_3900.s3887_incremental_even_weighted_cycle_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfEdgesAdded() {
        assertThat<Int>(
            Solution().numberOfEdgesAdded(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 1)),
            ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun numberOfEdgesAdded2() {
        assertThat<Int>(
            Solution().numberOfEdgesAdded(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 0)),
            ),
            equalTo<Int>(3),
        )
    }
}
