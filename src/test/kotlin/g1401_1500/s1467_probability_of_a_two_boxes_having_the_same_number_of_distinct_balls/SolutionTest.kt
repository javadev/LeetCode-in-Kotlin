package g1401_1500.s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val probability: Unit
        get() {
            assertThat(Solution().getProbability(intArrayOf(1, 1)), equalTo(1.00000))
        }

    @get:Test
    val probability2: Unit
        get() {
            assertThat(
                Solution().getProbability(intArrayOf(2, 1, 1)),
                equalTo(0.6666666666666666)
            )
        }

    @get:Test
    val probability3: Unit
        get() {
            assertThat(Solution().getProbability(intArrayOf(1, 2, 1, 2)), equalTo(0.60000))
        }
}
