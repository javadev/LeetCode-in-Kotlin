package g1301_1400.s1333_filter_restaurants_by_vegan_friendly_price_and_distance

// #Medium #Array #Sorting #2023_06_06_Time_326_ms_(100.00%)_Space_52.7_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun filterRestaurants(
        restaurants: Array<IntArray>,
        veganFriendly: Int,
        maxPrice: Int,
        maxDistance: Int
    ): List<Int> {
        val pq = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] == b[1]) b[0] - a[0] else b[1] - a[1] }
        for (i in restaurants.indices) {
            if (restaurants[i][3] <= maxPrice && restaurants[i][4] <= maxDistance) {
                if (veganFriendly == 1) {
                    if (restaurants[i][2] == 1) {
                        pq.offer(intArrayOf(restaurants[i][0], restaurants[i][1]))
                    }
                } else {
                    pq.offer(intArrayOf(restaurants[i][0], restaurants[i][1]))
                }
            }
        }
        val list: MutableList<Int> = ArrayList()
        while (pq.isNotEmpty()) {
            list.add(pq.poll()[0])
        }
        return list
    }
}
