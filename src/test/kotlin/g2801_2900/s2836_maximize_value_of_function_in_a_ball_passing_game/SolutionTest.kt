package g2801_2900.s2836_maximize_value_of_function_in_a_ball_passing_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val maxFunctionValue: Unit
        get() {
            assertThat(
                Solution().getMaxFunctionValue(mutableListOf(2, 0, 1), 4),
                equalTo(6L)
            )
        }

    @get:Test
    val maxFunctionValue2: Unit
        get() {
            assertThat(
                Solution().getMaxFunctionValue(mutableListOf(1, 1, 1, 2, 3), 3), equalTo(10L)
            )
        }
}
