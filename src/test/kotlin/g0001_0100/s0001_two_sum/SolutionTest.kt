package g0001_0100.s0001_two_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoSum() {
        assertThat(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9), equalTo(intArrayOf(0, 1)))
    }

    @Test
    fun twoSum2() {
        assertThat(Solution().twoSum(intArrayOf(3, 2, 4), 6), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun twoSum3() {
        assertThat(Solution().twoSum(intArrayOf(3, 3), 6), equalTo(intArrayOf(0, 1)))
    }

    @Test
    fun twoSum4() {
        assertThat(Solution().twoSum(intArrayOf(3, 3), 7), equalTo(intArrayOf(-1, -1)))
    }
}
