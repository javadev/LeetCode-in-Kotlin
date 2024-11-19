package g3201_3300.s3275_k_th_nearest_obstacle_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultsArray() {
        assertThat(
            Solution().resultsArray(
                arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(2, 3), intArrayOf(-3, 0)),
                2,
            ),
            equalTo(intArrayOf(-1, 7, 5, 3)),
        )
    }

    @Test
    fun resultsArray2() {
        assertThat(
            Solution().resultsArray(arrayOf(intArrayOf(5, 5), intArrayOf(4, 4), intArrayOf(3, 3)), 1),
            equalTo(intArrayOf(10, 8, 6)),
        )
    }
}
