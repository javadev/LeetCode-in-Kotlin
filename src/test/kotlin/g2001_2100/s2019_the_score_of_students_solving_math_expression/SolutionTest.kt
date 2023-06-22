package g2001_2100.s2019_the_score_of_students_solving_math_expression

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreOfStudents() {
        MatcherAssert.assertThat(
            Solution().scoreOfStudents("3+5*2", intArrayOf(13, 0, 10, 13, 13, 16, 16)),
            CoreMatchers.equalTo(19)
        )
    }

    @Test
    fun scoreOfStudents2() {
        MatcherAssert.assertThat(
            Solution().scoreOfStudents("6+0*1", intArrayOf(12, 9, 6, 4, 8, 6)),
            CoreMatchers.equalTo(10)
        )
    }

    @Test
    fun scoreOfStudents3() {
        MatcherAssert.assertThat(
            Solution().scoreOfStudents("3+5*2", intArrayOf(13, 0, 10, 13, 13, 16, 16)),
            CoreMatchers.equalTo(19)
        )
    }
}
