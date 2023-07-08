package g2501_2600.s2563_count_the_number_of_fair_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countFairPairs() {
        assertThat(
            Solution().countFairPairs(intArrayOf(0, 1, 7, 4, 4, 5), 3, 6),
            equalTo(6)
        )
    }

    @Test
    fun countFairPairs2() {
        assertThat(
            Solution().countFairPairs(intArrayOf(1, 7, 9, 2, 5), 11, 11),
            equalTo(1)
        )
    }
}
