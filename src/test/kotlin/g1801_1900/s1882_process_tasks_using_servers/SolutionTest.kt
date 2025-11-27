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

    @Test
    fun assignTasks3() {
        assertThat(
            Solution().assignTasks(intArrayOf(1), intArrayOf(1, 2, 3)),
            equalTo(intArrayOf(0, 0, 0)),
        )
    }

    @Test
    fun assignTasks4() {
        assertThat(
            Solution().assignTasks(intArrayOf(2, 2, 2), intArrayOf(1, 2, 1, 2)),
            equalTo(intArrayOf(0, 0, 1, 0)),
        )
    }

    @Test
    fun assignTasks5() {
        assertThat(
            Solution().assignTasks(intArrayOf(1, 2), intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(0, 0, 1, 0)),
        )
    }

    @Test
    fun assignTasks6() {
        assertThat(
            Solution().assignTasks(intArrayOf(1, 2, 3), intArrayOf()),
            equalTo(intArrayOf()),
        )
    }

    @Test
    fun assignTasks7() {
        assertThat(
            Solution().assignTasks(intArrayOf(3, 1, 4), intArrayOf(5)),
            equalTo(intArrayOf(1)),
        )
    }

    @Test
    fun assignTasks8() {
        assertThat(
            Solution().assignTasks(intArrayOf(1, 2), intArrayOf(2, 2, 2)),
            equalTo(intArrayOf(0, 1, 0)),
        )
    }

    @Test
    fun assignTasks9() {
        val servers = intArrayOf(5, 3, 1, 4, 2)
        val tasks = intArrayOf(1, 3, 5, 7, 9, 11)
        assertThat(
            Solution().assignTasks(servers, tasks),
            equalTo(intArrayOf(2, 2, 4, 1, 2, 3)),
        )
    }
}
