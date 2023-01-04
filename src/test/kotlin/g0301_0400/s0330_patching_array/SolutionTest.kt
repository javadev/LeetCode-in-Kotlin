package g0301_0400.s0330_patching_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPatches() {
        assertThat(Solution().minPatches(intArrayOf(1, 3), 6), equalTo(1))
    }

    @Test
    fun minPatches2() {
        assertThat(Solution().minPatches(intArrayOf(1, 5, 10), 20), equalTo(2))
    }

    @Test
    fun minPatches3() {
        assertThat(Solution().minPatches(intArrayOf(1, 2, 2), 5), equalTo(0))
    }
}
