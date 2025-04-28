package g3501_3600.s3532_path_existence_queries_in_a_graph_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathExistenceQueries() {
        assertThat<BooleanArray>(
            Solution()
                .pathExistenceQueries(2, intArrayOf(1, 3), 1, arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 1))),
            equalTo<BooleanArray>(booleanArrayOf(true, false)),
        )
    }

    @Test
    fun pathExistenceQueries2() {
        assertThat<BooleanArray>(
            Solution()
                .pathExistenceQueries(
                    4,
                    intArrayOf(2, 5, 6, 8),
                    2,
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3)),
                ),
            equalTo<BooleanArray>(booleanArrayOf(false, false, true, true)),
        )
    }
}
