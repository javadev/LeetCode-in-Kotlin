package g2101_2200.s2141_maximum_running_time_of_n_computers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRunTime() {
        assertThat(Solution().maxRunTime(2, intArrayOf(3, 3, 3)), equalTo(4L))
    }

    @Test
    fun maxRunTime2() {
        assertThat(Solution().maxRunTime(2, intArrayOf(1, 1, 1, 1)), equalTo(2L))
    }
}
