package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat<Int?>(Solution().minOperations(intArrayOf(0, 2)), CoreMatchers.equalTo<Int?>(1))
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat<Int?>(Solution().minOperations(intArrayOf(3, 1, 2, 1)), CoreMatchers.equalTo<Int?>(3))
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat<Int?>(
            Solution().minOperations(intArrayOf(1, 2, 1, 2, 1, 2)),
            CoreMatchers.equalTo<Int?>(4)
        )
    }
}
