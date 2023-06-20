package g1901_2000.s1962_remove_stones_to_minimize_the_total

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minStoneSum() {
        assertThat(Solution().minStoneSum(intArrayOf(5, 4, 9), 2), equalTo(12))
    }

    @Test
    fun minStoneSum2() {
        assertThat(Solution().minStoneSum(intArrayOf(4, 3, 6, 7), 3), equalTo(12))
    }
}
