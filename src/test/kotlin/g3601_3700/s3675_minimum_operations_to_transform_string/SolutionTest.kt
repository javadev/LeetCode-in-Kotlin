package g3601_3700.s3675_minimum_operations_to_transform_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("yz"), equalTo<Int>(2))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("a"), equalTo<Int>(0))
    }
}
