package g0901_1000.s0915_partition_array_into_disjoint_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionDisjoint() {
        assertThat(Solution().partitionDisjoint(intArrayOf(5, 0, 3, 8, 6)), equalTo(3))
    }

    @Test
    fun partitionDisjoint2() {
        assertThat(Solution().partitionDisjoint(intArrayOf(1, 1, 1, 0, 6, 12)), equalTo(4))
    }
}
