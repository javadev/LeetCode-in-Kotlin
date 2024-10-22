package g3301_3400.s3326_minimum_division_operations_to_make_array_non_decreasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(25, 7)), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(7, 7, 6)), equalTo<Int>(-1))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 1, 1, 1)), equalTo<Int>(0))
    }
}
