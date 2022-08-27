package g0001_0100.s0039_combination_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun combinationSum() {
        assertThat(Solution().combinationSum(intArrayOf(2, 3, 6, 7), 7), equalTo(arrayOf(intArrayOf(3, 2, 2).toList(), intArrayOf(7).toList()).toList()))
    }

    @Test
    fun combinationSum2() {
        assertThat(Solution().combinationSum(intArrayOf(2, 3, 5), 8), equalTo(arrayOf(intArrayOf(3, 3, 2).toList(), intArrayOf(2, 2, 2, 2).toList(), intArrayOf(5, 3).toList()).toList()))
    }

    @Test
    fun combinationSum3() {
        assertThat(Solution().combinationSum(intArrayOf(2), 1), equalTo(emptyArray<Int>().toList()))
    }
}
