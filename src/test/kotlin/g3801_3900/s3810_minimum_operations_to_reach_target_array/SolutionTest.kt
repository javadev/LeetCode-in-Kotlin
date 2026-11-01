package g3801_3900.s3810_minimum_operations_to_reach_target_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 2, 3), intArrayOf(2, 1, 3)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(4, 1, 4), intArrayOf(5, 1, 4)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(7, 3, 7), intArrayOf(5, 5, 9)),
            equalTo<Int>(2),
        )
    }
}
