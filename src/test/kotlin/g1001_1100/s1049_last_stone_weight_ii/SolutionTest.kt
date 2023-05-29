package g1001_1100.s1049_last_stone_weight_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastStoneWeightII() {
        assertThat(Solution().lastStoneWeightII(intArrayOf(2, 7, 4, 1, 8, 1)), equalTo(1))
    }

    @Test
    fun lastStoneWeightII2() {
        assertThat(Solution().lastStoneWeightII(intArrayOf(31, 26, 33, 21, 40)), equalTo(5))
    }
}
