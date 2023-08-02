package g2501_2600.s2512_reward_top_k_students

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun topStudents() {
        assertThat(
            Solution()
                .topStudents(
                    arrayOf("smart", "brilliant", "studious"),
                    arrayOf("not"),
                    arrayOf("this student is studious", "the student is smart"),
                    intArrayOf(1, 2),
                    2
                ),
            equalTo(mutableListOf(1, 2))
        )
    }

    @Test
    fun topStudents2() {
        assertThat(
            Solution()
                .topStudents(
                    arrayOf("smart", "brilliant", "studious"), arrayOf("not"),
                    arrayOf(
                        "this student is not studious", "the student is smart"
                    ),
                    intArrayOf(1, 2),
                    2
                ),
            equalTo(mutableListOf(2, 1))
        )
    }
}
