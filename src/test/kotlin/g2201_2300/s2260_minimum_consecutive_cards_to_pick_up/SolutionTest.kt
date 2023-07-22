package g2201_2300.s2260_minimum_consecutive_cards_to_pick_up

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCardPickup() {
        assertThat(Solution().minimumCardPickup(intArrayOf(3, 4, 2, 3, 4, 7)), equalTo(4))
    }

    @Test
    fun minimumCardPickup2() {
        assertThat(Solution().minimumCardPickup(intArrayOf(1, 0, 5, 3)), equalTo(-1))
    }
}
