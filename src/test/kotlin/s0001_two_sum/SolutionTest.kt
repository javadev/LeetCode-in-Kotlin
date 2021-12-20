package s0001_two_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun twoSum() {
        assertThat(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9), equalTo(intArrayOf(0, 1)))
    }
}
