package g3901_4000.s3914_minimum_operations_to_make_array_non_decreasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(3, 3, 2, 1)),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(5, 1, 2, 3)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minOperations3() {
        assertThat<Long>(Solution().minOperations(intArrayOf(7)), equalTo<Long>(0L))
    }

    @Test
    fun minOperations4() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(1, 2, 2, 4)),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun minOperations5() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(5, 1, 5, 1)),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun minOperations6() {
        assertThat<Long>(
            Solution()
                .minOperations(intArrayOf(1000000000, 1, 1000000000, 1, 1000000000, 1)),
            equalTo<Long>(2999999997L),
        )
    }
}
