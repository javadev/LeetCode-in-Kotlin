package g0501_0600.s0514_freedom_trail

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRotateSteps() {
        assertThat(Solution().findRotateSteps("godding", "gd"), equalTo(4))
    }

    @Test
    fun findRotateSteps2() {
        assertThat(Solution().findRotateSteps("godding", "godding"), equalTo(13))
    }
}
