package g2501_2600.s2540_minimum_common_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val common: Unit
        get() {
            assertThat(
                Solution().getCommon(intArrayOf(1, 2, 3), intArrayOf(2, 4)),
                equalTo(2)
            )
        }

    @get:Test
    val common2: Unit
        get() {
            assertThat(
                Solution().getCommon(intArrayOf(1, 2, 3, 6), intArrayOf(2, 3, 4, 5)),
                equalTo(2)
            )
        }
}
