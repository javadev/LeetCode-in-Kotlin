package g3801_3900.s3883_count_non_decreasing_arrays_with_given_digit_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countArrays() {
        assertThat<Int>(Solution().countArrays(intArrayOf(25, 1)), equalTo<Int>(6))
    }

    @Test
    fun countArrays2() {
        assertThat<Int>(Solution().countArrays(intArrayOf(1)), equalTo<Int>(4))
    }

    @Test
    fun countArrays3() {
        assertThat<Int>(Solution().countArrays(intArrayOf(2, 49, 23)), equalTo<Int>(0))
    }
}
