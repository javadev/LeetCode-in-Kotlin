package g2401_2500.s2432_the_employee_that_worked_on_the_longest_task

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hardestWorker() {
        assertThat(
            Solution().hardestWorker(arrayOf(intArrayOf(0, 3), intArrayOf(2, 5), intArrayOf(0, 9), intArrayOf(1, 15))),
            equalTo(1),
        )
    }

    @Test
    fun hardestWorker2() {
        assertThat(
            Solution().hardestWorker(arrayOf(intArrayOf(1, 1), intArrayOf(3, 7), intArrayOf(2, 12), intArrayOf(7, 17))),
            equalTo(3),
        )
    }

    @Test
    fun hardestWorker3() {
        assertThat(
            Solution().hardestWorker(arrayOf(intArrayOf(0, 10), intArrayOf(10, 20))),
            equalTo(0),
        )
    }
}
