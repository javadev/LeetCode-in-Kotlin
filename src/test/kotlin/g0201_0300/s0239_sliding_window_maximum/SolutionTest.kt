package g0201_0300.s0239_sliding_window_maximum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSlidingWindow() {
        assertThat(
            Solution().maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3),
            equalTo(intArrayOf(3, 3, 5, 5, 6, 7)),
        )
    }

    @Test
    fun maxSlidingWindow2() {
        assertThat(Solution().maxSlidingWindow(intArrayOf(1), 1), equalTo(intArrayOf(1)))
    }
}
