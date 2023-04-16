package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasGroupsSizeX() {
        assertThat(
            Solution().hasGroupsSizeX(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)), equalTo(true)
        )
    }

    @Test
    fun hasGroupsSizeX2() {
        assertThat(
            Solution().hasGroupsSizeX(intArrayOf(1, 1, 1, 2, 2, 2, 3, 3)), equalTo(false)
        )
    }
}
