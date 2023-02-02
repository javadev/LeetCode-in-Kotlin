package g0501_0600.s0599_minimum_index_sum_of_two_lists

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRestaurant() {
        val list1 = arrayOf<String?>("Shogun", "Tapioca Express", "Burger King", "KFC")
        val list2 = arrayOf(
            "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"
        )
        assertThat(Solution().findRestaurant(list1, list2), equalTo(arrayOf("Shogun")))
    }

    @Test
    fun findRestaurant2() {
        val list1 = arrayOf<String?>("Shogun", "Tapioca Express", "Burger King", "KFC")
        val list2 = arrayOf("KFC", "Shogun", "Burger King")
        assertThat(Solution().findRestaurant(list1, list2), equalTo(arrayOf("Shogun")))
    }
}
