package g1301_1400.s1335_minimum_difficulty_of_a_job_schedule

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifficulty() {
        assertThat(Solution().minDifficulty(intArrayOf(6, 5, 4, 3, 2, 1), 2), equalTo(7))
    }

    @Test
    fun minDifficulty2() {
        assertThat(Solution().minDifficulty(intArrayOf(9, 9, 9), 4), equalTo(-1))
    }

    @Test
    fun minDifficulty3() {
        assertThat(Solution().minDifficulty(intArrayOf(1, 1, 1), 3), equalTo(3))
    }
}
