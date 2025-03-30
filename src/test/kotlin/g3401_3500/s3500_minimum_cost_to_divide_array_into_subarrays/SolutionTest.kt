package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat<Long>(
            Solution().minimumCost(intArrayOf(3, 1, 4), intArrayOf(4, 6, 6), 1),
            equalTo<Long>(110L),
        )
    }

    @Test
    fun minimumCost2() {
        assertThat<Long>(
            Solution()
                .minimumCost(
                    intArrayOf(4, 8, 5, 1, 14, 2, 2, 12, 1),
                    intArrayOf(7, 2, 8, 4, 2, 2, 1, 1, 2),
                    7,
                ),
            equalTo<Long>(985L),
        )
    }
}
