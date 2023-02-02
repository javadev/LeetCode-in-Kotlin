package g0501_0600.s0526_beautiful_arrangement

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2023_01_15_Time_107_ms_(100.00%)_Space_33.5_MB_(75.00%)

class Solution {
    fun countArrangement(n: Int): Int {
        return backtrack(n, n, arrayOfNulls(1 shl n + 1), 0)
    }

    private fun backtrack(n: Int, index: Int, cache: Array<Int?>, cacheindex: Int): Int {
        if (index == 0) {
            return 1
        }
        var result = 0
        if (cache[cacheindex] != null) {
            return cache[cacheindex]!!
        }
        for (i in n downTo 1) {
            if (cacheindex and (1 shl i) == 0 && (i % index == 0 || index % i == 0)) {
                result += backtrack(n, index - 1, cache, cacheindex or (1 shl i))
            }
        }
        cache[cacheindex] = result
        return result
    }
}
