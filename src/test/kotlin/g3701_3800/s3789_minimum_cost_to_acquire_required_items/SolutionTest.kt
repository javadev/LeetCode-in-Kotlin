package g3701_3800.s3789_minimum_cost_to_acquire_required_items

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat<Long>(Solution().minimumCost(3, 2, 1, 3, 2), equalTo<Long>(3L))
    }

    @Test
    fun minimumCost2() {
        assertThat<Long>(Solution().minimumCost(5, 4, 15, 2, 3), equalTo<Long>(22L))
    }

    @Test
    fun minimumCost3() {
        assertThat<Long>(Solution().minimumCost(5, 4, 15, 0, 0), equalTo<Long>(0L))
    }
}
