package g1301_1400.s1376_time_needed_to_inform_all_employees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfMinutes() {
        assertThat(Solution().numOfMinutes(1, 0, intArrayOf(-1), intArrayOf(0)), equalTo(0))
    }

    @Test
    fun numOfMinutes2() {
        assertThat(
            Solution()
                .numOfMinutes(
                    6, 2, intArrayOf(2, 2, -1, 2, 2, 2), intArrayOf(0, 0, 1, 0, 0, 0)
                ),
            equalTo(1)
        )
    }
}
