package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(0, 2)), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 1, 2, 1)), equalTo<Int>(3))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 2, 1, 2, 1, 2)),
            equalTo<Int>(4),
        )
    }
}
