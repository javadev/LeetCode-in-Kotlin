package g3901_4000.s3987_minimum_total_cost_to_process_all_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat<Int>(Solution().minimumCost(intArrayOf(1, 2, 3, 4), 4), equalTo<Int>(3))
    }

    @Test
    fun minimumCost2() {
        assertThat<Int>(
            Solution().minimumCost(intArrayOf(1, 1, 7, 14), 4),
            equalTo<Int>(15),
        )
    }

    @Test
    fun minimumCost3() {
        assertThat<Int>(
            Solution().minimumCost(intArrayOf(1, 2, 3, 4), 10),
            equalTo<Int>(0),
        )
    }
}
