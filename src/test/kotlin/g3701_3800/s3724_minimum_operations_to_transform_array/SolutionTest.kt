package g3701_3800.s3724_minimum_operations_to_transform_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(2, 8), intArrayOf(1, 7, 3)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(1, 3, 6), intArrayOf(2, 4, 5, 3)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minOperations3() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(2), intArrayOf(3, 4)),
            equalTo<Long>(3L),
        )
    }
}
