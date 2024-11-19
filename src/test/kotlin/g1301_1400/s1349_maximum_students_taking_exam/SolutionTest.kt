package g1301_1400.s1349_maximum_students_taking_exam

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxStudents() {
        val input = arrayOf(
            charArrayOf('#', '.', '#', '#', '.', '#'),
            charArrayOf('.', '#', '#', '#', '#', '.'),
            charArrayOf('#', '.', '#', '#', '.', '#'),
        )
        assertThat(Solution().maxStudents(input), equalTo(4))
    }

    @Test
    fun maxStudents2() {
        val input = arrayOf(
            charArrayOf('.', '#'),
            charArrayOf('#', '#'),
            charArrayOf('#', '.'),
            charArrayOf('#', '#'),
            charArrayOf('.', '#'),
        )
        assertThat(Solution().maxStudents(input), equalTo(3))
    }

    @Test
    fun maxStudents3() {
        val input = arrayOf(
            charArrayOf('#', '.', '.', '.', '#'),
            charArrayOf('.', '#', '.', '#', '.'),
            charArrayOf('.', '.', '#', '.', '.'),
            charArrayOf('.', '#', '.', '#', '.'),
            charArrayOf('#', '.', '.', '.', '#'),
        )
        assertThat(Solution().maxStudents(input), equalTo(10))
    }
}
