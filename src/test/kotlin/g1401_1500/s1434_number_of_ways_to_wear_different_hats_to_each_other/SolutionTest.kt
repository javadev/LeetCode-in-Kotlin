package g1401_1500.s1434_number_of_ways_to_wear_different_hats_to_each_other

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberWays() {
        val input = listOf(mutableListOf(3, 4), mutableListOf(4, 5), listOf(5))
        assertThat(Solution().numberWays(input), equalTo(1))
    }

    @Test
    fun numberWays2() {
        val input = listOf(mutableListOf(3, 5, 1), mutableListOf(3, 5))
        assertThat(Solution().numberWays(input), equalTo(4))
    }

    @Test
    fun numberWays3() {
        val input = listOf(
            mutableListOf(1, 2, 3, 4), mutableListOf(1, 2, 3, 4),
            mutableListOf(1, 2, 3, 4), mutableListOf(1, 2, 3, 4)
        )
        assertThat(Solution().numberWays(input), equalTo(24))
    }
}
