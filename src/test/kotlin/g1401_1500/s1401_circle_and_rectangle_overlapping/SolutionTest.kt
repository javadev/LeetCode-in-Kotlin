package g1401_1500.s1401_circle_and_rectangle_overlapping

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkOverlap() {
        assertThat(Solution().checkOverlap(1, 0, 0, 1, -1, 3, 1), equalTo(true))
    }

    @Test
    fun checkOverlap2() {
        assertThat(Solution().checkOverlap(1, 1, 1, 1, -3, 2, -1), equalTo(false))
    }

    @Test
    fun checkOverlap3() {
        assertThat(Solution().checkOverlap(1, 0, 0, -1, 0, 0, 1), equalTo(true))
    }
}
