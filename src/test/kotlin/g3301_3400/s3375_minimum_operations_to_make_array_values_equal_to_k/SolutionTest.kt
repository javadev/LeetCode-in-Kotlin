package g3301_3400.s3375_minimum_operations_to_make_array_values_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(5, 2, 5, 4, 5), 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(2, 1, 2), 2), equalTo<Int>(-1))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(9, 7, 5, 3), 1),
            equalTo<Int>(4),
        )
    }
}
