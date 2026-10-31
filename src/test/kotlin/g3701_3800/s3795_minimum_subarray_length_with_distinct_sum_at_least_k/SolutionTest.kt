package g3701_3800.s3795_minimum_subarray_length_with_distinct_sum_at_least_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLength() {
        assertThat<Int>(Solution().minLength(intArrayOf(2, 2, 3, 1), 4), equalTo<Int>(2))
    }

    @Test
    fun minLength2() {
        assertThat<Int>(Solution().minLength(intArrayOf(3, 2, 3, 4), 5), equalTo<Int>(2))
    }

    @Test
    fun minLength3() {
        assertThat<Int>(Solution().minLength(intArrayOf(5, 5, 4), 5), equalTo<Int>(1))
    }
}
