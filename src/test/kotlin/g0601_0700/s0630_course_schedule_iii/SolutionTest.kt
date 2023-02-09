package g0601_0700.s0630_course_schedule_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scheduleCourse() {
        val input = arrayOf(intArrayOf(100, 200), intArrayOf(200, 1300), intArrayOf(1000, 1250), intArrayOf(2000, 3200))
        assertThat(Solution().scheduleCourse(input), equalTo(3))
    }

    @Test
    fun scheduleCourse2() {
        assertThat(Solution().scheduleCourse(arrayOf(intArrayOf(1, 2))), equalTo(1))
    }

    @Test
    fun scheduleCourse3() {
        assertThat(Solution().scheduleCourse(arrayOf(intArrayOf(3, 2), intArrayOf(4, 3))), equalTo(0))
    }

    @Test
    fun scheduleCourse4() {
        val input = arrayOf(
            intArrayOf(100, 200),
            intArrayOf(200, 1300),
            intArrayOf(1000, 1250),
            intArrayOf(2000, 3200),
            intArrayOf(300, 1200)
        )
        assertThat(Solution().scheduleCourse(input), equalTo(4))
    }
}
