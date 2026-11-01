package g3901_4000.s3957_maximum_sum_of_m_non_overlapping_subarrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(4, 1, -5, 2), 2, 1, 3),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maximumSum2() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(1, 0, 3, 4), 2, 1, 2),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun maximumSum3() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(-1, 7, -4), 1, 2, 3),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun maximumSum4() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(-3, -4, -1), 2, 1, 2),
            equalTo<Long>(-1L),
        )
    }

    @Test
    fun maximumSum5() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(1, 1, 1, 1, 1), 1, 1, 1),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun maximumSum6() {
        assertThat<Long>(
            Solution().maximumSum(intArrayOf(1, 2, 3, 4, 5), 2, 1, 1),
            equalTo<Long>(9L),
        )
    }
}
