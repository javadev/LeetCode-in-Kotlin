package g0101_0200.s0198_house_robber

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rob() {
        assertThat(Solution().rob(intArrayOf(1, 2, 3, 1)), equalTo(4))
    }

    @Test
    fun rob2() {
        assertThat(Solution().rob(intArrayOf(2, 7, 9, 3, 1)), equalTo(12))
    }
}
