package g1501_1600.s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTriplets() {
        assertThat(
            Solution().numTriplets(intArrayOf(7, 4), intArrayOf(5, 2, 8, 9)),
            equalTo(1),
        )
    }

    @Test
    fun numTriplets2() {
        assertThat(Solution().numTriplets(intArrayOf(1, 1), intArrayOf(1, 1, 1)), equalTo(9))
    }

    @Test
    fun numTriplets3() {
        assertThat(
            Solution().numTriplets(intArrayOf(7, 7, 8, 3), intArrayOf(1, 2, 9, 7)),
            equalTo(2),
        )
    }
}
