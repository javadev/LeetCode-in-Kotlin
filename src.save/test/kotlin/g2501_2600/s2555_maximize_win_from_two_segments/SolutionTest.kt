package g2501_2600.s2555_maximize_win_from_two_segments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeWin() {
        assertThat(Solution().maximizeWin(intArrayOf(1, 1, 2, 2, 3, 3, 5), 2), equalTo(7))
    }

    @Test
    fun maximizeWin2() {
        assertThat(Solution().maximizeWin(intArrayOf(1, 2, 3, 4), 0), equalTo(2))
    }
}
