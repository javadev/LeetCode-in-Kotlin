package g3501_3600.s3515_shortest_path_in_a_weighted_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun treeQueries() {
        assertThat<IntArray>(
            Solution()
                .treeQueries(
                    2,
                    arrayOf<IntArray>(intArrayOf(1, 2, 7)),
                    arrayOf<IntArray>(intArrayOf(2, 2), intArrayOf(1, 1, 2, 4), intArrayOf(2, 2)),
                ),
            equalTo<IntArray>(intArrayOf(7, 4)),
        )
    }

    @Test
    fun treeQueries2() {
        assertThat<IntArray>(
            Solution()
                .treeQueries(
                    3,
                    arrayOf<IntArray>(intArrayOf(1, 2, 2), intArrayOf(1, 3, 4)),
                    arrayOf<IntArray>(
                        intArrayOf(2, 1),
                        intArrayOf(2, 3),
                        intArrayOf(1, 1, 3, 7),
                        intArrayOf(2, 2),
                        intArrayOf(2, 3),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(0, 4, 2, 7)),
        )
    }

    @Test
    fun treeQueries3() {
        assertThat<IntArray>(
            Solution()
                .treeQueries(
                    4,
                    arrayOf<IntArray>(intArrayOf(1, 2, 2), intArrayOf(2, 3, 1), intArrayOf(3, 4, 5)),
                    arrayOf<IntArray>(
                        intArrayOf(2, 4),
                        intArrayOf(2, 3),
                        intArrayOf(1, 2, 3, 3),
                        intArrayOf(2, 2),
                        intArrayOf(2, 3),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(8, 3, 2, 5)),
        )
    }
}
