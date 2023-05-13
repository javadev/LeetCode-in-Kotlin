package g0901_1000.s1000_minimum_cost_to_merge_stones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeStones() {
        assertThat(Solution().mergeStones(intArrayOf(3, 2, 4, 1), 2), equalTo(20))
    }

    @Test
    fun mergeStones2() {
        assertThat(Solution().mergeStones(intArrayOf(3, 2, 4, 1), 3), equalTo(-1))
    }

    @Test
    fun mergeStones3() {
        assertThat(Solution().mergeStones(intArrayOf(3, 5, 1, 2, 6), 3), equalTo(25))
    }
}
