package g3801_3900.s3892_minimum_operations_to_achieve_at_least_k_peaks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(2, 1, 2), 1), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(4, 5, 3, 6), 2),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 7, 3), 2), equalTo<Int>(-1))
    }
}
