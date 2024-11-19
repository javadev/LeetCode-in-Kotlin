package g1901_2000.s1964_find_the_longest_valid_obstacle_course_at_each_position

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestObstacleCourseAtEachPosition() {
        assertThat(
            Solution().longestObstacleCourseAtEachPosition(intArrayOf(1, 2, 3, 2)),
            equalTo(intArrayOf(1, 2, 3, 3)),
        )
    }

    @Test
    fun longestObstacleCourseAtEachPosition2() {
        assertThat(
            Solution().longestObstacleCourseAtEachPosition(intArrayOf(2, 2, 1)),
            equalTo(intArrayOf(1, 2, 1)),
        )
    }

    @Test
    fun longestObstacleCourseAtEachPosition3() {
        assertThat(
            Solution().longestObstacleCourseAtEachPosition(intArrayOf(3, 1, 5, 6, 4, 2)),
            equalTo(intArrayOf(1, 1, 2, 3, 2, 2)),
        )
    }
}
