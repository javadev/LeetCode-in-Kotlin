package g0001_0100.s0031_next_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextPermutation() {
        val array = intArrayOf(1, 2, 3)
        Solution().nextPermutation(array)
        assertThat(array, equalTo(intArrayOf(1, 3, 2)))
    }

    @Test
    fun nextPermutation2() {
        val array = intArrayOf(3, 2, 1)
        Solution().nextPermutation(array)
        assertThat(array, equalTo(intArrayOf(1, 2, 3)))
    }

    @Test
    fun nextPermutation3() {
        val array = intArrayOf(1, 1, 5)
        Solution().nextPermutation(array)
        assertThat(array, equalTo(intArrayOf(1, 5, 1)))
    }
}
