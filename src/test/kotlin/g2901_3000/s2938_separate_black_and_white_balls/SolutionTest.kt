package g2901_3000.s2938_separate_black_and_white_balls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSteps() {
        assertThat(Solution().minimumSteps("101"), equalTo(1L))
    }

    @Test
    fun minimumSteps2() {
        assertThat(Solution().minimumSteps("100"), equalTo(2L))
    }

    @Test
    fun minimumSteps3() {
        assertThat(Solution().minimumSteps("0111"), equalTo(0L))
    }
}
