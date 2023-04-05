package g0601_0700.s0657_robot_return_to_origin

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun judgeCircle() {
        assertThat(Solution().judgeCircle("UD"), equalTo(true))
    }

    @Test
    fun judgeCircle2() {
        assertThat(Solution().judgeCircle("LL"), equalTo(false))
    }
}
