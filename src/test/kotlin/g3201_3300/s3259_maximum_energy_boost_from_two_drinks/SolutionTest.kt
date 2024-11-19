package g3201_3300.s3259_maximum_energy_boost_from_two_drinks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxEnergyBoost() {
        assertThat(
            Solution().maxEnergyBoost(intArrayOf(1, 3, 1), intArrayOf(3, 1, 1)),
            equalTo(5L),
        )
    }

    @Test
    fun maxEnergyBoost2() {
        assertThat(
            Solution().maxEnergyBoost(intArrayOf(4, 1, 1), intArrayOf(1, 1, 3)),
            equalTo(7L),
        )
    }
}
