package g1501_1600.s1558_minimum_numbers_of_function_calls_to_make_target_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(1, 5)), CoreMatchers.equalTo(5))
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(2, 2)), CoreMatchers.equalTo(3))
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat(Solution().minOperations(intArrayOf(4, 2, 5)), CoreMatchers.equalTo(6))
    }
}
