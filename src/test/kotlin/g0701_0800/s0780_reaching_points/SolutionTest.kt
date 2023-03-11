package g0701_0800.s0780_reaching_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reachingPoints() {
        assertThat(Solution().reachingPoints(1, 1, 3, 5), equalTo(true))
    }

    @Test
    fun reachingPoints2() {
        assertThat(Solution().reachingPoints(1, 1, 2, 2), equalTo(false))
    }

    @Test
    fun reachingPoints3() {
        assertThat(Solution().reachingPoints(1, 1, 1, 1), equalTo(true))
    }
}
