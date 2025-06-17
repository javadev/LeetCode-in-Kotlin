package g3501_3600.s3585_find_weighted_median_node_in_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMedian() {
        assertThat<IntArray>(
            Solution().findMedian(
                2,
                arrayOf<IntArray>(intArrayOf(0, 1, 7)),
                arrayOf<IntArray>(intArrayOf(1, 0), intArrayOf(0, 1)),
            ),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }

    @Test
    fun findMedian2() {
        assertThat<IntArray>(
            Solution()
                .findMedian(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(2, 0, 4)),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(2, 0), intArrayOf(1, 2)),
                ),
            equalTo<IntArray>(intArrayOf(1, 0, 2)),
        )
    }

    @Test
    fun findMedian3() {
        assertThat<IntArray>(
            Solution()
                .findMedian(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 2),
                        intArrayOf(0, 2, 5),
                        intArrayOf(1, 3, 1),
                        intArrayOf(2, 4, 3),
                    ),
                    arrayOf<IntArray>(intArrayOf(3, 4), intArrayOf(1, 2)),
                ),
            equalTo<IntArray>(intArrayOf(2, 2)),
        )
    }
}
