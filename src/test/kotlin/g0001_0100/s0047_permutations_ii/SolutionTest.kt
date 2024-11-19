package g0001_0100.s0047_permutations_ii

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun permuteUnique() {
        val expected = arrayOf(intArrayOf(1, 1, 2), intArrayOf(1, 2, 1), intArrayOf(2, 1, 1))
        assertThat(
            Solution().permuteUnique(intArrayOf(1, 1, 2)),
            equalTo(getLists(expected)),
        )
    }

    @Test
    fun permuteUnique2() {
        val expected = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(1, 3, 2),
            intArrayOf(2, 1, 3),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 2, 1),
            intArrayOf(3, 1, 2),
        )
        assertThat(
            Solution().permuteUnique(intArrayOf(1, 2, 3)),
            equalTo(getLists(expected)),
        )
    }
}
