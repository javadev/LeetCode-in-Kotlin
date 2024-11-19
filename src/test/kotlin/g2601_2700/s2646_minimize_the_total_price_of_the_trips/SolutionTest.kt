package g2601_2700.s2646_minimize_the_total_price_of_the_trips

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTotalPrice() {
        assertThat(
            Solution().minimumTotalPrice(
                4,
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3)),
                intArrayOf(2, 2, 10, 6),
                arrayOf(
                    intArrayOf(0, 3),
                    intArrayOf(2, 1),
                    intArrayOf(2, 3),
                ),
            ),
            equalTo(23),
        )
    }

    @Test
    fun minimumTotalPrice2() {
        assertThat(
            Solution().minimumTotalPrice(
                2,
                arrayOf(intArrayOf(0, 1)),
                intArrayOf(2, 2),
                arrayOf(
                    intArrayOf(0, 0),
                ),
            ),
            equalTo(1),
        )
    }
}
