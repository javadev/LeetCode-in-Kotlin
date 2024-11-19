package g2201_2300.s2300_successful_pairs_of_spells_and_potions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun successfulPairs() {
        assertThat(
            Solution().successfulPairs(intArrayOf(5, 1, 3), intArrayOf(1, 2, 3, 4, 5), 7),
            equalTo(intArrayOf(4, 0, 3)),
        )
    }

    @Test
    fun successfulPairs2() {
        assertThat(
            Solution().successfulPairs(intArrayOf(3, 1, 2), intArrayOf(8, 5, 8), 16),
            equalTo(intArrayOf(2, 0, 2)),
        )
    }
}
