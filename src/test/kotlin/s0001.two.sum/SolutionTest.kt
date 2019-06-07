package s0001.two.sum

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun twoSum() {
        assertThat(java.util.Arrays.toString(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)), equalTo("[0, 1]"))
    }
}
