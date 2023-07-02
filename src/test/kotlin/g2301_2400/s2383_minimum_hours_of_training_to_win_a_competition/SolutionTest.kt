package g2301_2400.s2383_minimum_hours_of_training_to_win_a_competition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumberOfHours() {
        assertThat(
            Solution()
                .minNumberOfHours(5, 3, intArrayOf(1, 4, 3, 2), intArrayOf(2, 6, 3, 1)),
            equalTo(8)
        )
    }

    @Test
    fun minNumberOfHours2() {
        assertThat(
            Solution().minNumberOfHours(2, 4, intArrayOf(1), intArrayOf(3)),
            equalTo(0)
        )
    }
}
