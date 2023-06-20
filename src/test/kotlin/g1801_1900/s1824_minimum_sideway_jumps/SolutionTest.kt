package g1801_1900.s1824_minimum_sideway_jumps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSideJumps() {
        assertThat(Solution().minSideJumps(intArrayOf(0, 1, 2, 3, 0)), equalTo(2))
    }

    @Test
    fun minSideJumps2() {
        assertThat(Solution().minSideJumps(intArrayOf(0, 1, 1, 3, 3, 0)), equalTo(0))
    }

    @Test
    fun minSideJumps3() {
        assertThat(Solution().minSideJumps(intArrayOf(0, 2, 1, 0, 3, 0)), equalTo(2))
    }
}
