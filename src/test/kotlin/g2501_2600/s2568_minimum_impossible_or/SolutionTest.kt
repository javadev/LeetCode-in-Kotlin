package g2501_2600.s2568_minimum_impossible_or

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minImpossibleOR() {
        assertThat(
            Solution().minImpossibleOR(intArrayOf(2, 1)),
            equalTo(4)
        )
    }

    @Test
    fun minImpossibleOR2() {
        assertThat(
            Solution().minImpossibleOR(intArrayOf(5, 3, 2)),
            equalTo(1)
        )
    }
}
