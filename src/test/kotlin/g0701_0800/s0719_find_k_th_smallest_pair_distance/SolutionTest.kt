package g0701_0800.s0719_find_k_th_smallest_pair_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestDistancePair() {
        assertThat(Solution().smallestDistancePair(intArrayOf(1, 3, 1), 1), equalTo(0))
    }

    @Test
    fun smallestDistancePair2() {
        assertThat(Solution().smallestDistancePair(intArrayOf(1, 1, 1), 2), equalTo(0))
    }

    @Test
    fun smallestDistancePair3() {
        assertThat(Solution().smallestDistancePair(intArrayOf(1, 6, 1), 3), equalTo(5))
    }
}
