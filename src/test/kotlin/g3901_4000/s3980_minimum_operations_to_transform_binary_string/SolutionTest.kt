package g3901_4000.s3980_minimum_operations_to_transform_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("11", "00"), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("01", "10"), equalTo<Int>(3))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations("1", "0"), equalTo<Int>(-1))
    }
}
