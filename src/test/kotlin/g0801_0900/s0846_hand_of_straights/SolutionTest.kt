package g0801_0900.s0846_hand_of_straights

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isNStraightHand() {
        assertThat(
            Solution().isNStraightHand(intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8), 3),
            equalTo(true)
        )
    }

    @Test
    fun isNStraightHand2() {
        assertThat(Solution().isNStraightHand(intArrayOf(1, 2, 3, 4, 5), 4), equalTo(false))
    }
}
