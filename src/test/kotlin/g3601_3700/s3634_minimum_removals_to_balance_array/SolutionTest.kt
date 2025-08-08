package g3601_3700.s3634_minimum_removals_to_balance_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minRemoval() {
        assertThat<Int>(Solution().minRemoval(intArrayOf(2, 1, 5), 2), equalTo<Int>(1))
    }

    @Test
    fun minRemoval2() {
        assertThat<Int>(Solution().minRemoval(intArrayOf(1, 6, 2, 9), 3), equalTo<Int>(2))
    }

    @Test
    fun minRemoval3() {
        assertThat<Int>(Solution().minRemoval(intArrayOf(4, 6), 2), equalTo<Int>(0))
    }
}
