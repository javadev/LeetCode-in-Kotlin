package g3401_3500.s3420_count_non_decreasing_subarrays_after_k_operations

// #Hard #Array #Two_Pointers #Stack #Monotonic_Stack #Queue #Segment_Tree #Monotonic_Queue
// #2025_01_15_Time_28_ms_(100.00%)_Space_68.93_MB_(88.89%)

class Solution {
    fun countNonDecreasingSubarrays(nums: IntArray, k: Int): Long {
        val n = nums.size
        reverse(nums)
        var res: Long = 0
        var t = k.toLong()
        val q = IntArray(n + 1)
        var hh = 0
        var tt = -1
        var j = 0
        var i = 0
        while (j < n) {
            while (hh <= tt && nums[q[tt]] < nums[j]) {
                val r = q[tt--]
                val l = if (hh <= tt) q[tt] else i - 1
                t -= (r - l).toLong() * (nums[j] - nums[r])
            }
            q[++tt] = j
            while (t < 0) {
                t += (nums[q[hh]] - nums[i]).toLong()
                if (q[hh] == i) hh++
                i++
            }
            res += (j - i + 1).toLong()
            j++
        }
        return res
    }

    private fun reverse(nums: IntArray) {
        val n = nums.size
        var i = 0
        var j = n - 1
        while (i < j) {
            val t = nums[i]
            nums[i] = nums[j]
            nums[j] = t
            i++
            j--
        }
    }
}
