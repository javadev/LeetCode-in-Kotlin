package g3801_3900.s3896_minimum_operations_to_transform_array_into_alternating_prime

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 2, 3, 4)), equalTo<Int>(3))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(5, 6, 7, 8)), equalTo<Int>(0))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(4, 4)), equalTo<Int>(1))
    }
}
