package g1001_1100.s1089_duplicate_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun duplicateZeros() {
        val input = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        Solution().duplicateZeros(input)
        assertThat(input, equalTo(intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)))
    }

    @Test
    fun duplicateZeros2() {
        val input = intArrayOf(1, 2, 3)
        Solution().duplicateZeros(input)
        assertThat(input, equalTo(intArrayOf(1, 2, 3)))
    }
}
