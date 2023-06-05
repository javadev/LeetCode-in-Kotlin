package g1301_1400.s1333_filter_restaurants_by_vegan_friendly_price_and_distance

import java.util.stream.Collectors

// #Medium #Array #Sorting
class Solution {
    fun filterRestaurants(
        restaurants: Array<IntArray>,
        veganFriendly: Int,
        maxPrice: Int,
        maxDistance: Int
    ): List<Int> {
        val list: MutableList<IntArray> = ArrayList()
        for (restaurant in restaurants) {
            if ((
                veganFriendly == 1 && restaurant[2] == 1 ||
                    veganFriendly == 0
                ) && restaurant[3] <= maxPrice &&
                restaurant[4] <= maxDistance
            ) {
                list.add(restaurant)
            }
        }
        list.sortWith { a: IntArray, b: IntArray -> if (b[1] - a[1] == 0) b[0] - a[0] else b[1] - a[1] }
        return list.stream().map { restaurant: IntArray -> restaurant[0] }.collect(Collectors.toList())
    }
}
