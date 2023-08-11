package g0401_0500.s0475_heaters

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2022_12_31_Time_356_ms_(87.50%)_Space_44.6_MB_(87.50%)

class Solution {
    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        var res = 0
        val m = houses.size
        val n = heaters.size
        var hs = 0
        var ht = 0
        houses.sort()
        heaters.sort()
        if (n == 1) {
            return Math.max(Math.abs(houses[0] - heaters[0]), Math.abs(houses[m - 1] - heaters[0]))
        }
        while (hs < m && ht < n - 1) {
            if (houses[hs] <= heaters[ht]) {
                res = Math.max(heaters[ht] - houses[hs], res)
                hs++
            } else if (houses[hs] <= heaters[ht + 1]) {
                res = Math.max(
                    res,
                    Math.min(houses[hs] - heaters[ht], heaters[ht + 1] - houses[hs])
                )
                hs++
            } else {
                ht++
            }
        }
        if (ht == n - 1) {
            res = Math.max(res, houses[m - 1] - heaters[n - 1])
        }
        return res
    }
}
