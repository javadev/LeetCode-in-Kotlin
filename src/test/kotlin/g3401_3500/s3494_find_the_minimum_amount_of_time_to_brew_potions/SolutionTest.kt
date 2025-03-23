package g3401_3500.s3494_find_the_minimum_amount_of_time_to_brew_potions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat<Long>(
            Solution().minTime(intArrayOf(1, 5, 2, 4), intArrayOf(5, 1, 4, 2)),
            equalTo<Long>(110L),
        )
    }

    @Test
    fun minTime2() {
        assertThat<Long>(
            Solution().minTime(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1)),
            equalTo<Long>(5L),
        )
    }

    @Test
    fun minTime3() {
        assertThat<Long>(
            Solution().minTime(intArrayOf(1, 2, 3, 4), intArrayOf(1, 2)),
            equalTo<Long>(21L),
        )
    }
}
