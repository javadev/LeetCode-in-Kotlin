package g2501_2600.s2594_minimum_time_to_repair_cars

@Suppress("NAME_SHADOWING")
class Solution {
    fun repairCars(ranks: IntArray, cars: Int): Long {
        ranks.sort()
        var low: Long = 0
        var hi = Long.MAX_VALUE
        var ans: Long = -1
        while (low <= hi) {
            val mid = (low + hi) / 2
            if (isPossible(mid, ranks, cars)) {
                hi = mid - 1
                ans = mid
            } else {
                low = mid + 1
            }
        }
        return ans
    }

    private fun isPossible(target: Long, ranks: IntArray, cars: Int): Boolean {
        var cars = cars
        for (i in ranks.indices) {
            cars -= Math.sqrt((target / ranks[i]).toDouble()).toInt()
            if (cars <= 0) {
                return true
            }
        }
        return false
    }
}
