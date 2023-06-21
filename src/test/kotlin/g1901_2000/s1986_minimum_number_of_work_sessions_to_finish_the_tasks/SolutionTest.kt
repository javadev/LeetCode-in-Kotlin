package g1901_2000.s1986_minimum_number_of_work_sessions_to_finish_the_tasks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSessions() {
        assertThat(Solution().minSessions(intArrayOf(1, 2, 3), 3), equalTo(2))
    }

    @Test
    fun minSessions2() {
        assertThat(Solution().minSessions(intArrayOf(3, 1, 3, 1, 1), 8), equalTo(2))
    }

    @Test
    fun minSessions3() {
        assertThat(Solution().minSessions(intArrayOf(1, 2, 3, 4, 5), 15), equalTo(1))
    }
}
