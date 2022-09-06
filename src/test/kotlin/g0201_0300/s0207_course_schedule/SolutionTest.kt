package g0201_0300.s0207_course_schedule

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canFinish() {
        assertThat(Solution().canFinish(2, arrayOf(intArrayOf(1, 0))), equalTo(true))
    }

    @Test
    fun canFinish2() {
        assertThat(
            Solution().canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))),
            equalTo(false)
        )
    }
}
