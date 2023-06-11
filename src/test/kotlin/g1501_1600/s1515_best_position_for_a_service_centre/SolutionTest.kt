package g1501_1600.s1515_best_position_for_a_service_centre

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val minDistSum: Unit
        get() {
            MatcherAssert.assertThat(
                Solution().getMinDistSum(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                        intArrayOf(1, 2),
                        intArrayOf(2, 1)
                    )
                ),
                CoreMatchers.equalTo(4.00)
            )
        }

    @get:Test
    val minDistSum2: Unit
        get() {
            MatcherAssert.assertThat(
                Solution().getMinDistSum(arrayOf(intArrayOf(1, 1), intArrayOf(3, 3))),
                CoreMatchers.equalTo(2.82842712474619)
            )
        }
}
