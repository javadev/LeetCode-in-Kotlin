package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(Solution().minCost(intArrayOf(6, 2, 8, 4)), equalTo<Int>(12))
    }

    @Test
    fun minCost2() {
        assertThat<Int>(Solution().minCost(intArrayOf(2, 1, 3, 3)), equalTo<Int>(5))
    }

    @Test
    fun minCost3() {
        assertThat<Int>(
            Solution().minCost(intArrayOf(83, 47, 66, 24, 57, 85, 16)),
            equalTo<Int>(224)
        )
    }
}
