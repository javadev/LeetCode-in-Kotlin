package g0701_0800.s0775_global_and_local_inversions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isIdealPermutation() {
        assertThat(Solution().isIdealPermutation(intArrayOf(1, 0, 2)), equalTo(true))
    }

    @Test
    fun isIdealPermutation2() {
        assertThat(Solution().isIdealPermutation(intArrayOf(1, 2, 0)), equalTo(false))
    }
}
