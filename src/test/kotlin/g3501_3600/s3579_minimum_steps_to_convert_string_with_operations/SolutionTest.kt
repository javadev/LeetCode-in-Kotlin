package g3501_3600.s3579_minimum_steps_to_convert_string_with_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("abcdf", "dacbe"), equalTo<Int>(4))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("abceded", "baecfef"), equalTo<Int>(4))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations("abcdef", "fedabc"), equalTo<Int>(2))
    }
}
