package g3301_3400.s3377_digit_operations_to_make_two_integers_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(10, 12), equalTo<Int>(85))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(4, 8), equalTo<Int>(-1))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(6, 2), equalTo<Int>(-1))
    }

    @Test
    fun minOperations4() {
        assertThat<Int>(Solution().minOperations(17, 72), equalTo<Int>(-1))
    }
}
