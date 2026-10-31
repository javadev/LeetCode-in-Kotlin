package g3801_3900.s3877_minimum_removals_to_achieve_target_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minRemovals() {
        assertThat<Int>(Solution().minRemovals(intArrayOf(1, 2, 3), 2), equalTo<Int>(1))
    }

    @Test
    fun minRemovals2() {
        assertThat<Int>(Solution().minRemovals(intArrayOf(2, 4), 1), equalTo<Int>(-1))
    }

    @Test
    fun minRemovals3() {
        assertThat<Int>(Solution().minRemovals(intArrayOf(7), 7), equalTo<Int>(0))
    }
}
