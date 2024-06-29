package g3101_3200.s3191_minimum_operations_to_make_binary_array_elements_equal_to_one_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(0, 1, 1, 1, 0, 0)), equalTo(3))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(0, 1, 1, 1)), equalTo(-1))
    }
}
