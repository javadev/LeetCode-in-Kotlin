package g2501_2600.s2511_maximum_enemy_forts_that_can_be_captured

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun captureForts() {
        assertThat(
            Solution().captureForts(intArrayOf(1, 0, 0, -1, 0, 0, 0, 0, 1)),
            equalTo(4),
        )
    }

    @Test
    fun captureForts2() {
        assertThat(Solution().captureForts(intArrayOf(0, 0, 1, -1)), equalTo(0))
    }
}
