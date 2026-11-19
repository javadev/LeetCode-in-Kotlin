package g4001_4100.s4021_minimum_operations_to_make_a_rotated_palindrome_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("abc"), equalTo<Int>(2))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("yb"), equalTo<Int>(3))
    }
}
