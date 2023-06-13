package g1501_1600.s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTriplets() {
        MatcherAssert.assertThat(
            Solution().numTriplets(intArrayOf(7, 4), intArrayOf(5, 2, 8, 9)), CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun numTriplets2() {
        MatcherAssert.assertThat(Solution().numTriplets(intArrayOf(1, 1), intArrayOf(1, 1, 1)), CoreMatchers.equalTo(9))
    }

    @Test
    fun numTriplets3() {
        MatcherAssert.assertThat(
            Solution().numTriplets(intArrayOf(7, 7, 8, 3), intArrayOf(1, 2, 9, 7)),
            CoreMatchers.equalTo(2)
        )
    }
}
