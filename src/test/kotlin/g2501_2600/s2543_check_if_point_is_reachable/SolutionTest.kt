package g2501_2600.s2543_check_if_point_is_reachable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isReachable() {
        assertThat(Solution().isReachable(6, 9), equalTo(false))
    }

    @Test
    fun isReachable2() {
        assertThat(Solution().isReachable(4, 7), equalTo(true))
    }
}
