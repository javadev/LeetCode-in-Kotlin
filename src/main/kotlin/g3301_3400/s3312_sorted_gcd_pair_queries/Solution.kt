package g3301_3400.s3312_sorted_gcd_pair_queries

// #Hard #Array #Hash_Table #Math #Binary_Search #Prefix_Sum #Counting #Number_Theory #Combinatorics
// #2024_10_12_Time_734_ms_(100.00%)_Space_75.3_MB_(50.00%)

import kotlin.math.max

class Solution {
    fun gcdValues(nums: IntArray, queries: LongArray): IntArray {
        var max = 1
        for (num in nums) {
            max = max(max, num)
        }
        val gcdDp = LongArray(max + 1)
        for (num in nums) {
            gcdDp[num]++
        }
        for (i in 1..max) {
            var count: Long = 0
            var j = i
            while (j <= max) {
                count += gcdDp[j]
                j = j + i
            }
            gcdDp[i] = ((count - 1) * count) / 2
        }
        for (i in max downTo 1) {
            var j = i + i
            while (j <= max) {
                gcdDp[i] -= gcdDp[j]
                j = j + i
            }
        }
        for (i in 1..max) {
            gcdDp[i] += gcdDp[i - 1]
        }
        val result = IntArray(queries.size)
        for (i in queries.indices) {
            result[i] = binarySearch(max, gcdDp, queries[i] + 1)
        }
        return result
    }

    private fun binarySearch(n: Int, arr: LongArray, `val`: Long): Int {
        var l = 1
        var r = n
        while (l < r) {
            val mid = l + (r - l) / 2
            if (arr[mid] < `val`) {
                l = mid + 1
            } else {
                r = mid
            }
        }
        return l
    }
}
