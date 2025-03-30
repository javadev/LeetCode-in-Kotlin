package g3501_3600.s3502_minimum_cost_to_reach_every_position

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCosts() {
        assertThat<IntArray>(
            Solution().minCosts(intArrayOf(5, 3, 4, 1, 3, 2)),
            equalTo<IntArray>(intArrayOf(5, 3, 3, 1, 1, 1)),
        )
    }

    @Test
    fun minCosts2() {
        assertThat<IntArray>(
            Solution().minCosts(intArrayOf(1, 2, 4, 6, 7)),
            equalTo<IntArray>(intArrayOf(1, 1, 1, 1, 1)),
        )
    }
}
