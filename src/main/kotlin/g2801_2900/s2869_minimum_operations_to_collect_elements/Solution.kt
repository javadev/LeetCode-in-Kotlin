package g2801_2900.s2869_minimum_operations_to_collect_elements

// #Easy #Array #Hash_Table #2023_12_21_Time_156_ms_(100.00%)_Space_35.2_MB_(53.85%)

import kotlin.math.max

class Solution {
    fun minOperations(nums: List<Int>, k: Int): Int {
        val visited = arrayOfNulls<Pair>(k + 1)
        visited[0] = Pair(0)
        var count = 0
        for (i in nums.indices.reversed()) {
            count++
            if (nums[i] <= k && visited[nums[i]] == null) {
                visited[nums[i]] = Pair(count)
            }
        }
        var fin = -1
        for (pair in visited) {
            if (pair != null) {
                fin = max(fin, pair.totalVisitedTillNow)
            }
        }
        return fin
    }

    private class Pair(var totalVisitedTillNow: Int)
}
