package g2201_2300.s2202_maximize_the_topmost_element_after_k_moves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTop() {
        assertThat(Solution().maximumTop(intArrayOf(5, 2, 2, 4, 0, 6), 4), equalTo(5))
    }

    @Test
    fun maximumTop2() {
        assertThat(Solution().maximumTop(intArrayOf(2), 1), equalTo(-1))
    }

    @Test
    fun maximumTop3() {
        assertThat(Solution().maximumTop(intArrayOf(3), 0), equalTo(3))
    }
}
