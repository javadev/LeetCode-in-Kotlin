package g2501_2600.s2543_check_if_point_is_reachable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isReachable: Unit
        get() {
            assertThat(Solution().isReachable(6, 9), equalTo(false))
        }

    @get:Test
    val isReachable2: Unit
        get() {
            assertThat(Solution().isReachable(4, 7), equalTo(true))
        }
}
