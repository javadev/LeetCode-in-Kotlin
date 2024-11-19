package g0001_0100.s0077_combinations

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun combine() {
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 4),
        )
        assertThat(Solution().combine(4, 2), equalTo(getLists(expected)))
    }

    @Test
    fun combine2() {
        val expected = arrayOf(intArrayOf(1))
        assertThat(Solution().combine(1, 1), equalTo(getLists(expected)))
    }
}
