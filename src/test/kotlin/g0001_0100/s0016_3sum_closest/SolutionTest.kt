package g0001_0100.s0016_3sum_closest

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun threeSumClosest() {
        assertThat(Solution().threeSumClosest(intArrayOf(-1, 2, 1, -4), 1), equalTo(2))
    }

    @Test
    fun threeSumClosest2() {
        assertThat(Solution().threeSumClosest(intArrayOf(0, 0, 0), 1), equalTo(0))
    }

    @Test
    fun threeSumClosest3() {
        assertThat(
            Solution().threeSumClosest(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128), 82),
            equalTo(82)
        )
    }

    @Test
    fun threeSumClosest4() {
        assertThat(
            Solution().threeSumClosest(intArrayOf(4, 0, 5, -5, 3, 3, 0, -4, -5), -2),
            equalTo(-2)
        )
    }
}
