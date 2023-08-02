package g0101_0200.s0162_find_peak_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPeakElement() {
        assertThat(Solution().findPeakElement(intArrayOf(1, 2, 3, 1)), equalTo(2))
    }

    @Test
    fun findPeakElement2() {
        assertThat(Solution().findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)), equalTo(5))
    }
}
