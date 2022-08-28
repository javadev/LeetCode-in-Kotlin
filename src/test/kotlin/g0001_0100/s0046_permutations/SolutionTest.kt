package g0001_0100.s0046_permutations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun permute() {
        assertThat(Solution().permute(intArrayOf(1, 2, 3)), equalTo(arrayOf(intArrayOf(3, 2, 1).toList(), intArrayOf(2, 3, 1).toList(), intArrayOf(2, 1, 3).toList(), intArrayOf(3, 1, 2).toList(), intArrayOf(1, 3, 2).toList(), intArrayOf(1, 2, 3).toList()).toList()))
    }

    @Test
    fun permute2() {
        assertThat(Solution().permute(intArrayOf(0, 1)), equalTo(arrayOf(intArrayOf(1, 0).toList(), intArrayOf(0, 1).toList()).toList()))
    }

    @Test
    fun permute3() {
        assertThat(Solution().permute(intArrayOf(1)), equalTo(arrayOf(intArrayOf(1).toList()).toList()))
    }
}
