package g1601_1700.s1606_find_servers_that_handled_most_number_of_requests

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun busiestServers() {
        assertThat(
            Solution()
                .busiestServers(3, intArrayOf(1, 2, 3, 4, 5), intArrayOf(5, 2, 3, 3, 3)),
            equalTo(listOf(1))
        )
    }

    @Test
    fun busiestServers2() {
        assertThat(
            Solution().busiestServers(3, intArrayOf(1, 2, 3, 4), intArrayOf(1, 2, 1, 2)),
            equalTo(listOf(0))
        )
    }

    @Test
    fun busiestServers3() {
        assertThat(
            Solution().busiestServers(3, intArrayOf(1, 2, 3), intArrayOf(10, 12, 11)),
            equalTo(mutableListOf(0, 1, 2))
        )
    }
}
