package g1801_1900.s1883_minimum_skips_to_arrive_at_meeting_on_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSkips() {
        assertThat(Solution().minSkips(intArrayOf(1, 3, 2), 4, 2), equalTo(1))
    }

    @Test
    fun minSkips2() {
        assertThat(Solution().minSkips(intArrayOf(7, 3, 5, 5), 2, 10), equalTo(2))
    }

    @Test
    fun minSkips3() {
        assertThat(Solution().minSkips(intArrayOf(7, 3, 5, 5), 1, 10), equalTo(-1))
    }
}
