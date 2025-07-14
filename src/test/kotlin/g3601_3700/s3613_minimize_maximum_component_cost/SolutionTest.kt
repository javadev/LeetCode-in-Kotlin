package g3601_3700.s3613_minimize_maximum_component_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution()
                .minCost(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 4),
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 2),
                        intArrayOf(3, 4, 6),
                    ),
                    2,
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(4, arrayOf<IntArray>(intArrayOf(0, 1, 5), intArrayOf(1, 2, 5), intArrayOf(2, 3, 5)), 1),
            equalTo<Int>(5),
        )
    }
}
