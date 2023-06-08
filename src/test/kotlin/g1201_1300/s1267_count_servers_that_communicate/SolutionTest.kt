package g1201_1300.s1267_count_servers_that_communicate

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countServers() {
        assertThat(
            Solution().countServers(
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(0, 1)
                )
            ),
            equalTo(0)
        )
    }

    @Test
    fun countServers2() {
        assertThat(
            Solution().countServers(
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 1)
                )
            ),
            equalTo(3)
        )
    }

    @Test
    fun countServers3() {
        assertThat(
            Solution()
                .countServers(
                    arrayOf(
                        intArrayOf(1, 1, 0, 0), intArrayOf(0, 0, 1, 0),
                        intArrayOf(0, 0, 1, 0), intArrayOf(0, 0, 0, 1)
                    )
                ),
            equalTo(4)
        )
    }
}
