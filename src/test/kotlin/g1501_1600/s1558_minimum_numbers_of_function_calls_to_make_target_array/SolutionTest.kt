package g1501_1600.s1558_minimum_numbers_of_function_calls_to_make_target_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(1, 5)), equalTo(5))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(2, 2)), equalTo(3))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(intArrayOf(4, 2, 5)), equalTo(6))
    }
}
