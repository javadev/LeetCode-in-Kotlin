package g3901_4000.s3942_minimum_operations_to_sort_a_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations(intArrayOf(0, 2, 1)), equalTo<Int>(2))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations(intArrayOf(1, 0, 2)), equalTo<Int>(2))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations(intArrayOf(2, 0, 1, 3)), equalTo<Int>(-1))
    }

    @Test
    fun minOperations4() {
        assertThat<Int>(Solution().minOperations(intArrayOf(0)), equalTo<Int>(0))
    }

    @Test
    fun minOperations5() {
        assertThat<Int>(Solution().minOperations(intArrayOf(0, 1, 2, 3)), equalTo<Int>(0))
    }

    @Test
    fun minOperations6() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 2, 1, 0)), equalTo<Int>(1))
    }

    @Test
    fun minOperations7() {
        assertThat<Int>(Solution().minOperations(intArrayOf(3, 0, 1, 2)), equalTo<Int>(1))
    }

    @Test
    fun minOperations8() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(1, 2, 3, 4, 5, 0)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minOperations9() {
        assertThat<Int>(
            Solution().minOperations(intArrayOf(0, 5, 4, 3, 2, 1)),
            equalTo<Int>(2),
        )
    }
}
