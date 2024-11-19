package g0201_0300.s0216_combination_sum_iii

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun combinationSum3() {
        assertThat(
            Solution().combinationSum3(3, 7),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(1, 2, 4)))),
        )
    }

    @Test
    fun combinationSum32() {
        assertThat(
            Solution().combinationSum3(3, 9),
            equalTo(ArrayUtils.getLists(arrayOf(intArrayOf(1, 2, 6), intArrayOf(1, 3, 5), intArrayOf(2, 3, 4)))),
        )
    }
}
