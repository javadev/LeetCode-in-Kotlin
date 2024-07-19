package g3201_3300.s3219_minimum_cost_for_cutting_cake_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution().minimumCost(3, 2, intArrayOf(1, 3), intArrayOf(5)),
            equalTo(13L)
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(Solution().minimumCost(2, 2, intArrayOf(7), intArrayOf(4)), equalTo(15L))
    }
}
