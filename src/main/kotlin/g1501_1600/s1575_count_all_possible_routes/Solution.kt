package g1501_1600.s1575_count_all_possible_routes

// #Hard #Array #Dynamic_Programming #Memoization
class Solution {
    private lateinit var cache: Array<Array<Int?>>

    fun countRoutes(locations: IntArray, start: Int, finish: Int, fuel: Int): Int {
        cache = Array(locations.size) { arrayOfNulls(fuel + 1) }
        return dfs(locations, start, finish, fuel)
    }

    private fun dfs(locations: IntArray, start: Int, finish: Int, fuel: Int): Int {
        if (cache[start][fuel] == null) {
            var count = 0
            if (start == finish) {
                count = (count + 1) % MOD
            }
            for (i in locations.indices) {
                if (i != start && Math.abs(locations[start] - locations[i]) <= fuel) {
                    count = (
                        count +
                            dfs(
                                locations,
                                i,
                                finish,
                                fuel - Math.abs(locations[start] - locations[i])
                            )
                        )
                    count = count % MOD
                }
            }
            cache[start][fuel] = count
        }
        return cache[start][fuel]!!
    }

    companion object {
        private const val MOD = 1000000007
    }
}
