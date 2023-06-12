package g1501_1600.s1515_best_position_for_a_service_centre

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistSum() {
        assertThat(
            Solution().getMinDistSum(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(2, 1)
                )
            ),
            equalTo(4.00)
        )
    }

    @Test
    fun minDistSum2() {
        assertThat(
            Solution().getMinDistSum(arrayOf(intArrayOf(1, 1), intArrayOf(3, 3))),
            equalTo(2.82842712474619)
        )
    }
}
