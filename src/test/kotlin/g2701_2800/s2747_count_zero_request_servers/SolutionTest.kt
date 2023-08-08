package g2701_2800.s2747_count_zero_request_servers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countServers() {
        assertThat(
            Solution().countServers(
                3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(1, 5)), 5,
                intArrayOf(10, 11)
            ),
            equalTo(
                intArrayOf(1, 2)
            )
        )
    }

    @Test
    fun countServers2() {
        assertThat(
            Solution().countServers(
                3,
                arrayOf(
                    intArrayOf(2, 4), intArrayOf(2, 1), intArrayOf(1, 2),
                    intArrayOf(3, 1)
                ),
                2, intArrayOf(3, 4)
            ),
            equalTo(
                intArrayOf(0, 1)
            )
        )
    }
}
