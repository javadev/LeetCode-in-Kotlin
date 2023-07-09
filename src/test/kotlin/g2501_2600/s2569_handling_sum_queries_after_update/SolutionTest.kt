package g2501_2600.s2569_handling_sum_queries_after_update

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun handleQuery() {
        assertThat(
            Solution().handleQuery(
                intArrayOf(1, 0, 1), intArrayOf(0, 0, 0),
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(2, 1, 0), intArrayOf(3, 0, 0)
                )
            ),
            equalTo(longArrayOf(3))
        )
    }

    @Test
    fun handleQuery2() {
        assertThat(
            Solution().handleQuery(intArrayOf(1), intArrayOf(5), arrayOf(intArrayOf(2, 0, 0), intArrayOf(3, 0, 0))),
            equalTo(longArrayOf(5))
        )
    }
}
