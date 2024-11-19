package g0601_0700.s0684_redundant_connection

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRedundantConnection() {
        assertThat(
            Solution().findRedundantConnection(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))),
            equalTo(intArrayOf(2, 3)),
        )
    }

    @Test
    fun findRedundantConnection2() {
        assertThat(
            Solution()
                .findRedundantConnection(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(1, 4),
                        intArrayOf(1, 5),
                    ),
                ),
            equalTo(intArrayOf(1, 4)),
        )
    }
}
