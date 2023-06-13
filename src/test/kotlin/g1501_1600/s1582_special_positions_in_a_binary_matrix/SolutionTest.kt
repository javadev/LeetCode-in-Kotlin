package g1501_1600.s1582_special_positions_in_a_binary_matrix

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSpecial() {
        MatcherAssert.assertThat(
            Solution().numSpecial(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0))),
            CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun numSpecial2() {
        MatcherAssert.assertThat(
            Solution().numSpecial(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))),
            CoreMatchers.equalTo(3)
        )
    }
}
