package g2401_2500.s2499_minimum_total_cost_to_make_arrays_unequal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTotalCost() {
        assertThat(
            Solution()
                .minimumTotalCost(intArrayOf(1, 2, 3, 4, 5), intArrayOf(1, 2, 3, 4, 5)),
            equalTo(10L),
        )
    }

    @Test
    fun minimumTotalCost2() {
        assertThat(
            Solution()
                .minimumTotalCost(intArrayOf(2, 2, 2, 1, 3), intArrayOf(1, 2, 2, 3, 3)),
            equalTo(10L),
        )
    }

    @Test
    fun minimumTotalCost3() {
        assertThat(
            Solution().minimumTotalCost(intArrayOf(1, 2, 2), intArrayOf(1, 2, 2)),
            equalTo(-1L),
        )
    }
}
