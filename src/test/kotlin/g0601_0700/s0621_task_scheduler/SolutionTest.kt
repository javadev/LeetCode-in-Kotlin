package g0601_0700.s0621_task_scheduler

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leastInterval() {
        assertThat(
            Solution().leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2),
            equalTo(8)
        )
    }

    @Test
    fun leastInterval2() {
        assertThat(
            Solution().leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 0),
            equalTo(6)
        )
    }

    @Test
    fun leastInterval3() {
        assertThat(
            Solution()
                .leastInterval(
                    charArrayOf(
                        'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'
                    ),
                    2
                ),
            equalTo(16)
        )
    }
}
