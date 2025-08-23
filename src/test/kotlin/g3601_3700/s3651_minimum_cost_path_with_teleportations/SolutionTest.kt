package g3601_3700.s3651_minimum_cost_path_with_teleportations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution().minCost(arrayOf<IntArray>(intArrayOf(1, 3, 3), intArrayOf(2, 5, 4), intArrayOf(4, 3, 5)), 2),
            equalTo<Int>(7),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                ),
                1,
            ),
            equalTo<Int>(9),
        )
    }
}
