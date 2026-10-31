package g3701_3800.s3766_minimum_operations_to_make_binary_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        val result = Solution().minOperations(intArrayOf(5, 6, 7))
        assertThat<Int>(result[0], equalTo<Int>(0))
        assertThat<Int>(result[1], equalTo<Int>(1))
        assertThat<Int>(result[2], equalTo<Int>(0))
    }

    @Test
    fun minOperations2() {
        val result = Solution().minOperations(intArrayOf(10))
        assertThat<Int>(result[0], equalTo<Int>(1))
    }

    @Test
    fun minOperations3() {
        val result = Solution().minOperations(intArrayOf(1, 2, 3, 4))
        assertThat<Int>(result[0], equalTo<Int>(0))
        assertThat<Int>(result[1], equalTo<Int>(1))
        assertThat<Int>(result[2], equalTo<Int>(0))
        assertThat<Int>(result[3], equalTo<Int>(1))
    }
}
