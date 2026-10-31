package g3701_3800.s3762_minimum_operations_to_equalize_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        val result = Solution().minOperations(intArrayOf(1, 3, 5), 2, arrayOf<IntArray>(intArrayOf(0, 2)))
        assertThat<Long>(result[0], equalTo<Long>(2L))
    }

    @Test
    fun minOperations2() {
        val result = Solution().minOperations(intArrayOf(1, 3, 5), 2, arrayOf<IntArray>(intArrayOf(0, 1)))
        assertThat<Long>(result[0], equalTo<Long>(1L))
    }

    @Test
    fun minOperations3() {
        val result = Solution().minOperations(intArrayOf(1, 2), 2, arrayOf<IntArray>(intArrayOf(0, 1)))
        assertThat<Long>(result[0], equalTo<Long>(-1L))
    }
}
