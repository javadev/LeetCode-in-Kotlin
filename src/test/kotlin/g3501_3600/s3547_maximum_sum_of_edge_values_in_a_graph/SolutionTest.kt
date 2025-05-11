package g3501_3600.s3547_maximum_sum_of_edge_values_in_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Long>(
            Solution()
                .maxScore(
                    7,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0),
                        intArrayOf(3, 4),
                        intArrayOf(4, 5),
                        intArrayOf(5, 6)
                    )
                ),
            equalTo<Long>(130L)
        )
    }

    @Test
    fun maxScore2() {
        assertThat<Long>(
            Solution()
                .maxScore(
                    6,
                    arrayOf<IntArray>(
                        intArrayOf(0, 3),
                        intArrayOf(4, 5),
                        intArrayOf(2, 0),
                        intArrayOf(1, 3),
                        intArrayOf(2, 4),
                        intArrayOf(1, 5)
                    )
                ),
            equalTo<Long>(82L)
        )
    }
}
