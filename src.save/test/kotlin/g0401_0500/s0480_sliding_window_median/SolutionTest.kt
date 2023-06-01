package g0401_0500.s0480_sliding_window_median

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun medianSlidingWindow() {
        assertThat(
            Solution().medianSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3),
            equalTo(doubleArrayOf(1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000))
        )
    }

    @Test
    fun medianSlidingWindow2() {
        assertThat(
            Solution().medianSlidingWindow(intArrayOf(1, 2, 3, 4, 2, 3, 1, 4, 2), 3),
            equalTo(
                doubleArrayOf(
                    2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000
                )
            )
        )
    }
}
