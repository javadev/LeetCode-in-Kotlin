package g1501_1600.s1575_count_all_possible_routes

// #Hard #Array #Dynamic_Programming #Memoization
// #2023_06_14_Time_246_ms_(100.00%)_Space_37.7_MB_(100.00%)

class Solution {
    fun countRoutes(locations: IntArray, start: Int, finish: Int, fuel: Int): Int {
        val n = locations.size
        val cache = Array(n) { IntArray(fuel + 1) }
        for (i in 0 until n) {
            cache[i].fill(-1)
        }
        return dfsHelper(locations, start, finish, fuel, cache)
    }

    companion object {
        var MOD = 1000000007
        private fun dfsHelper(locations: IntArray, start: Int, finish: Int, fuel: Int, cache: Array<IntArray>): Int {
            if (cache[start][fuel] != -1) {
                return cache[start][fuel]
            }
            if (fuel == 0 && start != finish) {
                cache[start][fuel] = 0
                return 0
            }
            if (fuel > 0 && Math.abs(locations[start] - locations[finish]) > fuel) {
                cache[start][fuel] = 0
                return 0
            }
            var cnt = if (start == finish) 1 else 0
            for (i in locations.indices) {
                if (i != start) {
                    val need = Math.abs(locations[start] - locations[i])
                    if (need <= fuel) {
                        cnt += dfsHelper(locations, i, finish, fuel - need, cache)
                        cnt %= MOD
                    }
                }
            }
            cache[start][fuel] = cnt
            return cnt
        }
    }
}
