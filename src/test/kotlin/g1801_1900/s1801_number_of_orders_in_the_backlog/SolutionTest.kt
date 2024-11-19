package g1801_1900.s1801_number_of_orders_in_the_backlog

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfBacklogOrders() {
        assertThat(
            Solution()
                .getNumberOfBacklogOrders(
                    arrayOf(
                        intArrayOf(10, 5, 0),
                        intArrayOf(15, 2, 1),
                        intArrayOf(25, 1, 1),
                        intArrayOf(30, 4, 0),
                    ),
                ),
            equalTo(6),
        )
    }

    @Test
    fun numberOfBacklogOrders2() {
        assertThat(
            Solution()
                .getNumberOfBacklogOrders(
                    arrayOf(
                        intArrayOf(7, 1000000000, 1),
                        intArrayOf(15, 3, 0),
                        intArrayOf(5, 999999995, 0),
                        intArrayOf(5, 1, 1),
                    ),
                ),
            equalTo(999999984),
        )
    }
}
