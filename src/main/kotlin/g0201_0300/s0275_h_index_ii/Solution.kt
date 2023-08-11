package g0201_0300.s0275_h_index_ii

// #Medium #Array #Binary_Search #Binary_Search_II_Day_8
// #2022_11_03_Time_398_ms_(81.82%)_Space_49.1_MB_(90.91%)

class Solution {
    fun hIndex(citations: IntArray): Int {
        var lo = 1
        var hi = 1000
        var ans = 0
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            val p = check(mid, citations)
            if (citations.size - p >= mid) {
                ans = mid
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return ans
    }

    private fun check(v: Int, arr: IntArray): Int {
        var lo = 0
        var hi = arr.size - 1
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            if (arr[mid] < v) {
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return lo
    }
}
