package g1601_1700.s1700_number_of_students_unable_to_eat_lunch

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countStudents() {
        assertThat(
            Solution().countStudents(intArrayOf(1, 1, 0, 0), intArrayOf(0, 1, 0, 1)),
            equalTo(0),
        )
    }

    @Test
    fun countStudents2() {
        assertThat(
            Solution()
                .countStudents(intArrayOf(1, 1, 1, 0, 0, 1), intArrayOf(1, 0, 0, 0, 1, 1)),
            equalTo(3),
        )
    }
}
