package g0601_0700.s0685_redundant_connection_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRedundantDirectedConnection() {
        assertThat(
            Solution()
                .findRedundantDirectedConnection(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))),
            equalTo(intArrayOf(2, 3))
        )
    }

    @Test
    fun findRedundantDirectedConnection2() {
        assertThat(
            Solution()
                .findRedundantDirectedConnection(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(4, 1),
                        intArrayOf(1, 5)
                    )
                ),
            equalTo(intArrayOf(4, 1))
        )
    }
}
