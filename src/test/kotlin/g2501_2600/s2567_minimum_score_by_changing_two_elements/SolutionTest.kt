package g2501_2600.s2567_minimum_score_by_changing_two_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeSum() {
        assertThat(
            Solution().minimizeSum(intArrayOf(1, 4, 3)),
            equalTo(0),
        )
    }

    @Test
    fun minimizeSum2() {
        assertThat(
            Solution().minimizeSum(intArrayOf(1, 4, 7, 8, 5)),
            equalTo(3),
        )
    }
}
