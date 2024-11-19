package g2701_2800.s2712_minimum_cost_to_make_all_characters_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution().minimumCost("0011"),
            equalTo(2),
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution().minimumCost("010101"),
            equalTo(9),
        )
    }
}
