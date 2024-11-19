package g1401_1500.s1450_number_of_students_doing_homework_at_a_given_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun busyStudent() {
        assertThat(
            Solution().busyStudent(intArrayOf(1, 2, 3), intArrayOf(3, 2, 7), 4),
            equalTo(1),
        )
    }

    @Test
    fun busyStudent2() {
        assertThat(Solution().busyStudent(intArrayOf(4), intArrayOf(4), 4), equalTo(1))
    }
}
