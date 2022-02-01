package g0001_0100.s0015_3sum

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun threeSum() {
        assertThat(
            Solution().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(-1, -1, 2), intArrayOf(-1, 0, 1))))
        )
    }
}
