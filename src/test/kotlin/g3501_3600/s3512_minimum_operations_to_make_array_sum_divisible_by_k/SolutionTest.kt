package g3501_3600.s3512_minimum_operations_to_make_array_sum_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 9, 7), 5), equalTo<Int>(4))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(4, 1, 3), 4), equalTo<Int>(0))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 2), 6), equalTo<Int>(5))
    }
}
