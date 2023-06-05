package g1301_1400.s1333_filter_restaurants_by_vegan_friendly_price_and_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun filterRestaurants() {
        val restaurants = arrayOf(
            intArrayOf(1, 4, 1, 40, 10), intArrayOf(2, 8, 0, 50, 5),
            intArrayOf(3, 8, 1, 30, 4), intArrayOf(4, 10, 0, 10, 3), intArrayOf(5, 1, 1, 15, 1)
        )
        assertThat(
            Solution().filterRestaurants(restaurants, 1, 50, 10),
            equalTo(mutableListOf(3, 1, 5))
        )
    }

    @Test
    fun filterRestaurants2() {
        val restaurants = arrayOf(
            intArrayOf(1, 4, 1, 40, 10), intArrayOf(2, 8, 0, 50, 5),
            intArrayOf(3, 8, 1, 30, 4), intArrayOf(4, 10, 0, 10, 3), intArrayOf(5, 1, 1, 15, 1)
        )
        assertThat(
            Solution().filterRestaurants(restaurants, 0, 50, 10),
            equalTo(mutableListOf(4, 3, 2, 1, 5))
        )
    }

    @Test
    fun filterRestaurants3() {
        val restaurants = arrayOf(
            intArrayOf(1, 4, 1, 40, 10), intArrayOf(2, 8, 0, 50, 5),
            intArrayOf(3, 8, 1, 30, 4), intArrayOf(4, 10, 0, 10, 3), intArrayOf(5, 1, 1, 15, 1)
        )
        assertThat(
            Solution().filterRestaurants(restaurants, 0, 30, 3),
            equalTo(mutableListOf(4, 5))
        )
    }
}
