package g0001_0100.s0018_4sum

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fourSum() {
        assertThat(
            Solution().fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0),
            equalTo(
                getLists(arrayOf(intArrayOf(-2, -1, 1, 2), intArrayOf(-2, 0, 0, 2), intArrayOf(-1, 0, 0, 1))),
            ),
        )
    }

    @Test
    fun fourSum2() {
        assertThat(
            Solution().fourSum(intArrayOf(2, 2, 2, 2, 2), 8),
            equalTo(
                getLists(arrayOf(intArrayOf(2, 2, 2, 2))),
            ),
        )
    }

    @Test
    fun fourSum3() {
        assertThat(
            Solution().fourSum(intArrayOf(2, 2, 2), 8),
            equalTo(
                listOf(),
            ),
        )
    }

    @Test
    fun fourSum4() {
        assertThat(
            Solution().fourSum(intArrayOf(1000000000, 1000000000), 8),
            equalTo(
                listOf(),
            ),
        )
    }
}
