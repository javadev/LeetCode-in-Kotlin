package g1801_1900.s1817_finding_the_users_active_minutes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findingUsersActiveMinutes() {
        assertThat(
            Solution()
                .findingUsersActiveMinutes(
                    arrayOf(
                        intArrayOf(0, 5),
                        intArrayOf(1, 2),
                        intArrayOf(0, 2),
                        intArrayOf(0, 5),
                        intArrayOf(1, 3)
                    ),
                    5
                ),
            equalTo(intArrayOf(0, 2, 0, 0, 0))
        )
    }

    @Test
    fun findingUsersActiveMinutes2() {
        assertThat(
            Solution().findingUsersActiveMinutes(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(2, 3)), 4),
            equalTo(intArrayOf(1, 1, 0, 0))
        )
    }
}
