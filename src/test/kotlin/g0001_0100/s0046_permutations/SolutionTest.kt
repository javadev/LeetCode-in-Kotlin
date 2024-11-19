package g0001_0100.s0046_permutations

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun permute() {
        val expected = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(1, 3, 2),
            intArrayOf(2, 1, 3),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 1, 2),
            intArrayOf(3, 2, 1),
        )
        assertThat(
            Solution().permute(intArrayOf(1, 2, 3)),
            equalTo(getLists(expected)),
        )
    }

    @Test
    fun permute2() {
        val expected = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))
        assertThat(
            Solution().permute(intArrayOf(0, 1)),
            equalTo(getLists(expected)),
        )
    }

    @Test
    fun permute3() {
        val expected = arrayOf(intArrayOf(1))
        assertThat(Solution().permute(intArrayOf(1)), equalTo(getLists(expected)))
    }
}
