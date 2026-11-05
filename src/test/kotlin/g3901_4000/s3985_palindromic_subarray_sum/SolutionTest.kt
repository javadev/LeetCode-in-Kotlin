package g3901_4000.s3985_palindromic_subarray_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getSum() {
        assertThat<Long>(Solution().getSum(intArrayOf(10, 10)), equalTo<Long>(20L))
    }

    @Test
    fun getSum2() {
        assertThat<Long>(
            Solution().getSum(intArrayOf(1, 2, 3, 2, 1, 5, 6)),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun getSum3() {
        assertThat<Long>(
            Solution().getSum(intArrayOf(7, 1, 2, 1, 7, 3, 4, 3, 4)),
            equalTo<Long>(18L),
        )
    }

    @Test
    fun getSum4() {
        assertThat<Long>(Solution().getSum(intArrayOf(1, 2, 3, 4, 5)), equalTo<Long>(5L))
    }

    @Test
    fun getSum5() {
        assertThat<Long>(Solution().getSum(intArrayOf(1000)), equalTo<Long>(1000L))
    }
}
