package g1901_2000.s1901_find_a_peak_element_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPeakGrid() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(1, 4), intArrayOf(3, 2))),
            equalTo(intArrayOf(1, 0))
        )
    }

    @Test
    fun findPeakGrid2() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(10, 20, 15), intArrayOf(21, 30, 14), intArrayOf(7, 16, 32))),
            equalTo(intArrayOf(1, 1))
        )
    }
}
