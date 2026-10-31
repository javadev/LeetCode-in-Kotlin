package g3701_3800.s3755_find_maximum_balanced_xor_subarray_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxBalancedSubarray() {
        assertThat<Int>(
            Solution().maxBalancedSubarray(intArrayOf(3, 1, 3, 2, 0)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxBalancedSubarray2() {
        assertThat<Int>(
            Solution().maxBalancedSubarray(intArrayOf(3, 2, 8, 5, 4, 14, 9, 15)),
            equalTo<Int>(8),
        )
    }
}
