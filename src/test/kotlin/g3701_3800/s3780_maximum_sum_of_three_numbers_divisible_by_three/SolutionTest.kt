package g3701_3800.s3780_maximum_sum_of_three_numbers_divisible_by_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        assertThat<Int>(Solution().maximumSum(intArrayOf(4, 2, 3, 1)), equalTo<Int>(9))
    }

    @Test
    fun maximumSum2() {
        assertThat<Int>(Solution().maximumSum(intArrayOf(2, 1, 5)), equalTo<Int>(0))
    }
}
