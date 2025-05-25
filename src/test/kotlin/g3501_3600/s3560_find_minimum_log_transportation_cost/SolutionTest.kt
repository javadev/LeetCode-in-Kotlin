package g3501_3600.s3560_find_minimum_log_transportation_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCuttingCost() {
        assertThat<Long>(Solution().minCuttingCost(6, 5, 5), equalTo<Long>(5L))
    }

    @Test
    fun minCuttingCost2() {
        assertThat<Long>(Solution().minCuttingCost(4, 4, 6), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost3() {
        assertThat<Long>(Solution().minCuttingCost(0, 5, 3), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost4() {
        assertThat<Long>(Solution().minCuttingCost(5, 0, 3), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost5() {
        assertThat<Long>(Solution().minCuttingCost(5, 3, 0), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost6() {
        assertThat<Long>(Solution().minCuttingCost(2, 2, 2), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost7() {
        assertThat<Long>(Solution().minCuttingCost(1, 1, 3), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost8() {
        assertThat<Long>(Solution().minCuttingCost(2, 5, 2), equalTo<Long>(6L))
    }

    @Test
    fun minCuttingCost9() {
        assertThat<Long>(Solution().minCuttingCost(1, 10, 9), equalTo<Long>(9L))
    }

    @Test
    fun minCuttingCost10() {
        assertThat<Long>(Solution().minCuttingCost(8, 3, 2), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost11() {
        assertThat<Long>(
            Solution().minCuttingCost(11, 5, 9),
            equalTo<Long>((11L - 9L) * 9L),
        )
    }

    @Test
    fun minCuttingCost12() {
        assertThat<Long>(Solution().minCuttingCost(10, 15, 2), equalTo<Long>(0L))
    }

    @Test
    fun minCuttingCost13() {
        assertThat<Long>(
            Solution().minCuttingCost(Int.Companion.MAX_VALUE, Int.Companion.MAX_VALUE, 2),
            equalTo<Long>(0L),
        )
    }
}
