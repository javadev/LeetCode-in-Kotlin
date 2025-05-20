package g3501_3600.s3553_minimum_weighted_subgraph_with_the_required_paths_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumWeight() {
        assertThat<IntArray>(
            Solution()
                .minimumWeight(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 2),
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 5),
                        intArrayOf(1, 4, 4),
                        intArrayOf(2, 5, 6),
                    ),
                    arrayOf<IntArray>(intArrayOf(2, 3, 4), intArrayOf(0, 2, 5)),
                ),
            equalTo<IntArray>(intArrayOf(12, 11)),
        )
    }

    @Test
    fun minimumWeight2() {
        assertThat<IntArray>(
            Solution()
                .minimumWeight(
                    arrayOf<IntArray>(intArrayOf(1, 0, 8), intArrayOf(0, 2, 7)),
                    arrayOf<IntArray>(intArrayOf(0, 1, 2)),
                ),
            equalTo<IntArray>(intArrayOf(15)),
        )
    }

    @Test
    fun minimumWeight3() {
        assertThat<IntArray>(
            Solution()
                .minimumWeight(
                    arrayOf<IntArray>(intArrayOf(1, 0, 4), intArrayOf(2, 0, 5)),
                    arrayOf<IntArray>(intArrayOf(1, 0, 2)),
                ),
            equalTo<IntArray>(intArrayOf(9)),
        )
    }
}
