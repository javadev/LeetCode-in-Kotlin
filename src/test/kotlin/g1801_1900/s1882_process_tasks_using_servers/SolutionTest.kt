package g1801_1900.s1882_process_tasks_using_servers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun assignTasks() {
        assertThat(
            Solution().assignTasks(intArrayOf(3, 3, 2), intArrayOf(1, 2, 3, 2, 1, 2)),
            equalTo(intArrayOf(2, 2, 0, 2, 1, 2)),
        )
    }

    @Test
    fun assignTasks2() {
        assertThat(
            Solution()
                .assignTasks(intArrayOf(5, 1, 4, 3, 2), intArrayOf(2, 1, 2, 4, 5, 2, 1)),
            equalTo(intArrayOf(1, 4, 1, 4, 1, 3, 2)),
        )
    }
}
