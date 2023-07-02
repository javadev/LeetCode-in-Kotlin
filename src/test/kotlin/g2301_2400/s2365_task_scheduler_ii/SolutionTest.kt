package g2301_2400.s2365_task_scheduler_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun taskSchedulerII() {
        assertThat(Solution().taskSchedulerII(intArrayOf(1, 2, 1, 2, 3, 1), 3), equalTo(9L))
    }

    @Test
    fun taskSchedulerII2() {
        assertThat(Solution().taskSchedulerII(intArrayOf(5, 8, 8, 5), 2), equalTo(6L))
    }
}
