package g1001_1100.s1046_last_stone_weight

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastStoneWeight() {
        assertThat(Solution().lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)), equalTo(1))
    }

    @Test
    fun lastStoneWeight2() {
        assertThat(Solution().lastStoneWeight(intArrayOf(1)), equalTo(1))
    }
}
