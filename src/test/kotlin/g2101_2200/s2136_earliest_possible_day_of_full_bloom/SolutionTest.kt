package g2101_2200.s2136_earliest_possible_day_of_full_bloom

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestFullBloom() {
        assertThat(
            Solution().earliestFullBloom(intArrayOf(1, 4, 3), intArrayOf(2, 3, 1)),
            equalTo(9),
        )
    }

    @Test
    fun earliestFullBloom2() {
        assertThat(
            Solution().earliestFullBloom(intArrayOf(1, 2, 3, 2), intArrayOf(2, 1, 2, 1)),
            equalTo(9),
        )
    }

    @Test
    fun earliestFullBloom3() {
        assertThat(Solution().earliestFullBloom(intArrayOf(1), intArrayOf(1)), equalTo(2))
    }
}
