package g2701_2800.s2791_count_paths_that_can_form_a_palindrome_in_a_tree

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Bit_Manipulation #Bitmask
// #2023_08_06_Time_683_ms_(100.00%)_Space_54_MB_(100.00%)

class Solution {
    private fun getMap(parent: List<Int>, s: String, dp: IntArray, idx: Int): Int {
        if (dp[idx] < 0) {
            dp[idx] = 0
            dp[idx] = getMap(parent, s, dp, parent[idx]) xor (1 shl s[idx].code - 'a'.code)
        }
        return dp[idx]
    }

    fun countPalindromePaths(parent: List<Int>, s: String): Long {
        val n: Int = parent.size
        val dp = IntArray(n)
        var ans: Long = 0
        val mapCount: MutableMap<Int, Int> = HashMap()
        dp.fill(-1)
        dp[0] = 0
        for (i in 0 until n) {
            val currMap = getMap(parent, s, dp, i)
            // if map are same, two points can form a path;
            val evenCount = mapCount[currMap] ?: 0
            mapCount.put(currMap, evenCount + 1)
        }
        for (key in mapCount.keys) {
            val value = mapCount[key]!!
            ans += value.toLong() * (value - 1) shr 1
            for (i in 0..25) {
                val base = 1 shl i
                // if this map at i is 1, which means odd this bit
                if (key and base > 0 && mapCount.containsKey(key xor base)) {
                    // key ^ base is the map that is 0 at bit i, odd pairs with even,
                    // can pair and no duplicate
                    ans += value.toLong() * mapCount[key xor base]!!
                }
            }
        }
        return ans
    }
}
