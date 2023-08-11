package g2501_2600.s2545_sort_the_students_by_their_kth_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortTheStudents() {
        assertThat(
            Solution()
                .sortTheStudents(arrayOf(intArrayOf(10, 6, 9, 1), intArrayOf(7, 5, 11, 2), intArrayOf(4, 8, 3, 15)), 2),
            equalTo(arrayOf(intArrayOf(7, 5, 11, 2), intArrayOf(10, 6, 9, 1), intArrayOf(4, 8, 3, 15)))
        )
    }

    @Test
    fun sortTheStudents2() {
        assertThat(
            Solution().sortTheStudents(arrayOf(intArrayOf(3, 4), intArrayOf(5, 6)), 0),
            equalTo(arrayOf(intArrayOf(5, 6), intArrayOf(3, 4)))
        )
    }
}
