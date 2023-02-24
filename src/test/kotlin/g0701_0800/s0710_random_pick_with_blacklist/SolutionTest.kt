package g0701_0800.s0710_random_pick_with_blacklist

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solutionTest() {
        val expected = intArrayOf(0, 1, 4, 6)
        val solution = Solution(7, intArrayOf(2, 3, 5))
        for (i in 0..6) {
            assertThat(checkContain(expected, solution.pick()), equalTo(true))
        }
    }

    private fun checkContain(array: IntArray, value: Int): Boolean {
        for (j in array) {
            if (j == value) {
                return true
            }
        }
        return false
    }
}
