package g0001_0100.s0078_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsets() {
        assertThat(Solution().subsets(intArrayOf(1, 2, 3)), equalTo(arrayOf(intArrayOf().toList(), intArrayOf(1).toList(), intArrayOf(1, 2).toList(), intArrayOf(1, 2, 3).toList(), intArrayOf(1, 3).toList(), intArrayOf(2).toList(), intArrayOf(2, 3).toList(), intArrayOf(3).toList()).toList()))
    }

    @Test
    fun subsets2() {
        assertThat(Solution().subsets(intArrayOf(0)), equalTo(arrayOf(intArrayOf().toList(), intArrayOf(0).toList()).toList()))
    }
}
