package g3501_3600.s3534_path_existence_queries_in_a_graph_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathExistenceQueries() {
        assertThat<IntArray>(
            Solution()
                .pathExistenceQueries(
                    5,
                    intArrayOf(1, 8, 3, 4, 2),
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(2, 4)),
                ),
            equalTo<IntArray>(intArrayOf(1, 1)),
        )
    }

    @Test
    fun pathExistenceQueries2() {
        assertThat<IntArray>(
            Solution()
                .pathExistenceQueries(
                    5,
                    intArrayOf(5, 3, 1, 9, 10),
                    2,
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(4, 3)),
                ),
            equalTo<IntArray>(intArrayOf(1, 2, -1, 1)),
        )
    }

    @Test
    fun pathExistenceQueries3() {
        assertThat<IntArray>(
            Solution()
                .pathExistenceQueries(
                    3,
                    intArrayOf(3, 6, 1),
                    1,
                    arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 2)),
                ),
            equalTo<IntArray>(intArrayOf(0, -1, -1)),
        )
    }
}
