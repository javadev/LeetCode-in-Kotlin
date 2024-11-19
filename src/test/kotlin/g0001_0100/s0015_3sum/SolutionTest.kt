package g0001_0100.s0015_3sum

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun threeSum() {
        assertThat(
            Solution().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)),
            equalTo(getLists(arrayOf(intArrayOf(-1, -1, 2), intArrayOf(-1, 0, 1)))),
        )
    }

    @Test
    fun threeSum2() {
        assertThat(
            Solution().threeSum(intArrayOf()),
            equalTo(listOf()),
        )
    }

    @Test
    fun threeSum3() {
        assertThat(
            Solution().threeSum(intArrayOf(0)),
            equalTo(listOf()),
        )
    }
}
