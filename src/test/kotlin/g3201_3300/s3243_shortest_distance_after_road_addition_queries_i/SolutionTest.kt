package g3201_3300.s3243_shortest_distance_after_road_addition_queries_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestDistanceAfterQueries() {
        assertThat(
            Solution()
                .shortestDistanceAfterQueries(5, arrayOf(intArrayOf(2, 4), intArrayOf(0, 2), intArrayOf(0, 4))),
            equalTo(intArrayOf(3, 2, 1))
        )
    }

    @Test
    fun shortestDistanceAfterQueries2() {
        assertThat(
            Solution().shortestDistanceAfterQueries(4, arrayOf(intArrayOf(0, 3), intArrayOf(0, 2))),
            equalTo(intArrayOf(1, 1))
        )
    }
}
