package g0201_0300.s0210_course_schedule_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun courseScheduleII() {
        val prerequisites = arrayOf(intArrayOf(1, 0))
        val numCourses = 2
        assertThat(Solution().findOrder(numCourses, prerequisites), equalTo(intArrayOf(0, 1)))
    }

    @Test
    fun courseScheduleII2() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))
        val numCourses = 4
        assertThat(
            Solution().findOrder(numCourses, prerequisites),
            equalTo(intArrayOf(0, 1, 2, 3)),
        )
    }

    @Test
    fun courseScheduleII3() {
        val prerequisites = arrayOf<IntArray>()
        val numCourses = 1
        assertThat(Solution().findOrder(numCourses, prerequisites), equalTo(intArrayOf(0)))
    }
}
