package g3601_3700.s3666_minimum_operations_to_equalize_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("110", 1), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("0101", 3), equalTo<Int>(2))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations("101", 2), equalTo<Int>(-1))
    }
}
