package g4001_4100.s4012_count_of_unfinished_tasks_after_each_shift

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTasks() {
        assertThat<IntArray>(
            Solution().countTasks(intArrayOf(1, 4, 4), intArrayOf(9, 1, 4)),
            equalTo<IntArray>(intArrayOf(0, 2, 1)),
        )
    }

    @Test
    fun countTasks2() {
        assertThat<IntArray>(
            Solution().countTasks(intArrayOf(2, 3, 4), intArrayOf(20, 4, 5)),
            equalTo<IntArray>(intArrayOf(0, 2, 0)),
        )
    }

    @Test
    fun countTasks3() {
        assertThat<IntArray>(
            Solution().countTasks(intArrayOf(4, 2), intArrayOf(3, 6, 1)),
            equalTo<IntArray>(intArrayOf(2, 0, 2)),
        )
    }
}
