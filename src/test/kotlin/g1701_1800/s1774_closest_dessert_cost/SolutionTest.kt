package g1701_1800.s1774_closest_dessert_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestCost() {
        assertThat(Solution().closestCost(intArrayOf(1, 7), intArrayOf(3, 4), 10), equalTo(10))
    }

    @Test
    fun closestCost2() {
        assertThat(
            Solution().closestCost(intArrayOf(2, 3), intArrayOf(4, 5, 100), 18),
            equalTo(17),
        )
    }

    @Test
    fun closestCost3() {
        assertThat(Solution().closestCost(intArrayOf(3, 10), intArrayOf(2, 5), 9), equalTo(8))
    }
}
