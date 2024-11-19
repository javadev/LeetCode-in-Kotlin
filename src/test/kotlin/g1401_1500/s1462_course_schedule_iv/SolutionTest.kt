package g1401_1500.s1462_course_schedule_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkIfPrerequisite() {
        assertThat(
            Solution()
                .checkIfPrerequisite(2, arrayOf(intArrayOf(1, 0)), arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))),
            equalTo(mutableListOf(false, true)),
        )
    }

    @Test
    fun checkIfPrerequisite2() {
        assertThat(
            Solution().checkIfPrerequisite(2, arrayOf(), arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))),
            equalTo(mutableListOf(false, false)),
        )
    }

    @Test
    fun checkIfPrerequisite3() {
        assertThat(
            Solution()
                .checkIfPrerequisite(
                    3,
                    arrayOf(intArrayOf(1, 2), intArrayOf(1, 0), intArrayOf(2, 0)),
                    arrayOf(intArrayOf(1, 0), intArrayOf(1, 2)),
                ),
            equalTo(mutableListOf(true, true)),
        )
    }
}
