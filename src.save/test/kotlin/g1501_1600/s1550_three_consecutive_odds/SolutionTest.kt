package g1501_1600.s1550_three_consecutive_odds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun threeConsecutiveOdds() {
        assertThat(Solution().threeConsecutiveOdds(intArrayOf(2, 6, 4, 1)), equalTo(false))
    }

    @Test
    fun threeConsecutiveOdds2() {
        assertThat(
            Solution().threeConsecutiveOdds(intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12)),
            equalTo(true)
        )
    }
}
