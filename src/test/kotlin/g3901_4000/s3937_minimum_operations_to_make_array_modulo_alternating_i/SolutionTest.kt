package g3901_4000.s3937_minimum_operations_to_make_array_modulo_alternating_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 4, 2, 8), 3),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 1, 1), 3), equalTo<Int>(1))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1000000000), 100),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minOperations4() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 2, 3, 4), 2),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minOperations5() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(2, 2, 2, 2), 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minOperations6() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 5, 1, 4), 5),
            equalTo<Int>(1),
        )
    }
}
