package g0101_0200.s0167_two_sum_ii_input_array_is_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoSum() {
        assertThat(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun twoSum2() {
        assertThat(Solution().twoSum(intArrayOf(2, 3, 4), 6), equalTo(intArrayOf(1, 3)))
    }

    @Test
    fun twoSum3() {
        assertThat(Solution().twoSum(intArrayOf(-1, 0), -1), equalTo(intArrayOf(1, 2)))
    }
}
