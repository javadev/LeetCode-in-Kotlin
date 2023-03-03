package g0001_0100.s0090_subsets_ii

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsetsWithDup() {
        val expected = arrayOf(
            intArrayOf(1), intArrayOf(1, 2), intArrayOf(1, 2, 2),
            intArrayOf(2), intArrayOf(2, 2), intArrayOf()
        )
        assertThat(
            Solution().subsetsWithDup(intArrayOf(1, 2, 2)),
            equalTo(getLists(expected))
        )
    }

    @Test
    fun subsetsWithDup2() {
        val expected = arrayOf(intArrayOf(0), intArrayOf())
        assertThat(
            Solution().subsetsWithDup(intArrayOf(0)),
            equalTo(getLists(expected))
        )
    }
}
